package be.dog.d.steven.controller;

import be.dog.d.steven.model.BirthForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/birth")
public class BirthFormController {

    @Autowired
    private LocalValidatorFactoryBean validator;

    @GetMapping
    public String getBirthForm(Model model){
        model.addAttribute("birthForm", new BirthForm());
        return "birthForm";
    }

    @PostMapping
    public String submitBirthForm(Model model, @ModelAttribute("birthForm")BirthForm birthForm, BindingResult bindingResult){
        model.addAttribute("birthForm", birthForm);
        validator.validate(birthForm, bindingResult);
        if(bindingResult.hasErrors()){
            return "birthForm";
        }

        // to DB

        return "redirect:births";
    }
}
