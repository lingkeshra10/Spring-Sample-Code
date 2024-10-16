package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    private static final List<String> programmingLanguages = List.of("Java", "GoLang", "Python", "Ruby", "TypeScript", "Rust");

    @GetMapping("/showStudentForm")
    public String showForm(Model theModel){

        //create a new student object
        Student theStudent= new Student();

        //add student object to the model
        theModel.addAttribute("student", theStudent);

        theModel.addAttribute("countries", countries);

        // Add programming languages map to the model
        theModel.addAttribute("programmingLanguages", programmingLanguages);

        // Provide a list of operating systems for checkboxes
        List<String> favouriteOSOptions = Arrays.asList("Linux", "Windows", "macOS");
        theModel.addAttribute("favouriteOSOptions", favouriteOSOptions);

        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processStudentForm(@ModelAttribute("student") Student student, Model theModel) {
        // The programmingLang field already contains the language name (e.g., "Java")
        theModel.addAttribute("programmingLanguageName", student.getProgrammingLang());

        return "student-confirmation"; // Redirect to a success page
    }
}
