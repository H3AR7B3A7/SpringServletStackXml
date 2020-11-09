package be.dog.d.steven.controller;

import be.dog.d.steven.model.BirthForm;
import be.dog.d.steven.util.DateEditor;
import be.dog.d.steven.util.IdEditor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("/birth")
public class BirthFormController {

    @Autowired
    @Qualifier("customValidator")
    private Validator validator;

    @InitBinder("birthForm")
    public void initBinder(WebDataBinder binder){
//        binder.setValidator(validator);
        binder.registerCustomEditor(Integer.class, new IdEditor());
        binder.registerCustomEditor(Date.class, new DateEditor());
    }

    @GetMapping
    public String getBirthForm(Model model){
        model.addAttribute("birthForm", new BirthForm());
        return "birthForm";
    }

    @PostMapping
    public String submitBirthForm(Model model, @ModelAttribute("birthForm") @Validated BirthForm birthForm, BindingResult bindingResult){
        model.addAttribute("birthForm", birthForm);
        validator.validate(birthForm, bindingResult);
        if(bindingResult.hasErrors()){
            return "birthForm";
        }

        // to DB

        return "redirect:births";
    }
}
