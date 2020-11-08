package be.dog.d.steven.controller;

import be.dog.d.steven.model.EmployeeForm;
import be.dog.d.steven.service.MongoService;
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
@RequestMapping("/employee")
public class EmployeeFormController {
    @Autowired
    private LocalValidatorFactoryBean validator;

    @GetMapping
    public String getForm(Model model){
        model.addAttribute("employeeForm", new EmployeeForm());
        return "form";
    }

    @PostMapping
    public String submitForm(Model model, @ModelAttribute("employeeForm")EmployeeForm employeeForm, BindingResult bindingResult){
        model.addAttribute("employeeForm", employeeForm);
        validator.validate(employeeForm, bindingResult);
        if(bindingResult.hasErrors()){
            return "form";
        }

        MongoService.insert(employeeForm);

        return "redirect:employees";
    }

}
