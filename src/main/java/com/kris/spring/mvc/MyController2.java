package com.kris.spring.mvc;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.naming.Binding;


@Controller
@RequestMapping("/employee")
public class MyController2 {
    @RequestMapping("/")
    public String firstView(){
        return "first-view";
    }

    @RequestMapping("/askDetails") // аннотация для связи с юрл
    public String askEmployeeDetails(Model model){
        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view2";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp,
                                 BindingResult bindingResult){
        if (bindingResult.hasErrors())return "ask-emp-details-view2";
        else return "show-emp-details-view2";

    }
         }
