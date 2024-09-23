package com.example.springbootthymeleafdemo.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @GetMapping("/showForm")
    public String showForm(){
        return "helloShowForm";
    }
/*
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloProcessForm";
    }
*/
    /*
    @RequestMapping("/processFormVersionTwo")
    public String processFormVersionTwo(HttpServletRequest request,Model model){
        String name= request.getParameter("studentName");
        name=name.toUpperCase();
        String result="Hello Welcome to our College ! "+name;
        model.addAttribute("message",result);
        return "helloProcessForm";
    }
     */
@PostMapping("/processFormVersionThree")
public String processFormVersionTwo(@RequestParam("studentName")String name, Model model){
    name=name.toUpperCase();
    String result="Hello Welcome to our College ! "+name;
    model.addAttribute("message",result);
    return "helloProcessForm";
}
}
