package be.dog.d.steven.controller;

import be.dog.d.steven.model.Education;
import be.dog.d.steven.model.SalaryGrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectBeanController {

    @Autowired
    @Qualifier("salaryGrade")
    SalaryGrade salaryGrade;

    @Autowired
    @Qualifier("education")
    Education education;

    @GetMapping("/salgrade2")
    public String processRequestBeansRedirect(Model model){

        model.addAttribute("salaryGrade", salaryGrade);
        model.addAttribute("education", education);

        return "beanscopes2";
    }

}
