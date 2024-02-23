package com.example.PersonAddress.controller;

import com.example.PersonAddress.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PersonController {

    private static final Logger log = LogManager.getLogger(PersonController.class);

    List<Person> personList = new ArrayList<>();

    @ModelAttribute("person") // Pre-populate form object
    public Person person() {
        return new Person();
    }

    @GetMapping("/")
    public String showForm(Model model) {

        //Default log level = Info
        log.trace("Trace msg from showForm method");
        log.debug("Debug msg from showForm method");
        log.info("Info msg from showForm method");
        log.warn("Warn msg from showForm method");
        log.fatal("fatal msg from showForm method");
        log.error("Error msg from showForm method");

        try {
            model.addAttribute("person", person());
            log.info("This is the person form");
        } catch(Exception e) {
            log.warn("Error getting person form in showForm method");
        }
        return "person_form";
    }

    @PostMapping("/")
    public String submitForm(@ModelAttribute Person person, Model model) {
        personList.add(person);
        // Process submitted data, save if needed
        model.addAttribute("submittedPerson", personList); // Add submitted object

        log.trace("Trace msg from submitForm method");
        log.debug("Debug msg from submitForm method");
        log.info("Info msg from submitForm method");
        log.warn("Warn msg from submitForm method");
        log.fatal("fatal msg from submitForm method");
        log.error("Error msg from submitForm method");

        return "person_display"; // Name of Thymeleaf template with display
    }
}
