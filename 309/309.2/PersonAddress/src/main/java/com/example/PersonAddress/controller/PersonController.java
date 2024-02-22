package com.example.PersonAddress.controller;

import com.example.PersonAddress.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PersonController {

    List<Person> personList = new ArrayList<>();

    @ModelAttribute("person") // Pre-populate form object
    public Person person() {
        return new Person();
    }

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("person", person()); // Add pre-populated object
        return "person_form"; // Name of Thymeleaf template
    }

    @PostMapping("/")
    public String submitForm(@ModelAttribute Person person, Model model) {
        personList.add(person);
        // Process submitted data, save if needed
        model.addAttribute("submittedPerson", personList); // Add submitted object
        return "person_display"; // Name of Thymeleaf template with display
    }
}
