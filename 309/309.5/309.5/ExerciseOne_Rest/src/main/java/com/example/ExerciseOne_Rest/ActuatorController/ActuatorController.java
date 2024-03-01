package com.example.ExerciseOne_Rest.ActuatorController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ActuatorController {
    @GetMapping("/get-info")
    public String getStringMessage() {
        return "Hi ! You will be able to monitor the health of the application !!" ;
    }
}
