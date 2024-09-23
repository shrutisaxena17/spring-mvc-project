package com.example.springbootthymeleafdemo.controller;

import com.example.springbootthymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    List<String> countries;

    @GetMapping("/showStudentForm")
    public String showForm(Model model){
        model.addAttribute("student", new Student());
        model.addAttribute("countries",countries);
        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent){
        //log the input data
        System.out.println("Student: "+theStudent.getFirstName()+" "+theStudent.getLastName()+" "+theStudent.getCountry()+" "+theStudent.getProgrammingLanguage()+theStudent.getOperatingSystem());
        return "process-form";
    }
}
