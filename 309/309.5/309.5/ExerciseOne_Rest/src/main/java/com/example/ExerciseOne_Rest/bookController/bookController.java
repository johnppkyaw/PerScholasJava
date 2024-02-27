package com.example.ExerciseOne_Rest.bookController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class bookController {
    @GetMapping("/books/{ISBN}")


    //@PathVariable("ISBN") - name as alias

    public String showBookDetails(@PathVariable() String ISBN, Model model){
        model.addAttribute("ISBNAttribute", ISBN);
        return "bookDetails";
    }


}
