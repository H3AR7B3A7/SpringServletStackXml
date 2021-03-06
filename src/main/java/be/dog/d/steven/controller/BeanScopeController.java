package be.dog.d.steven.controller;

import be.dog.d.steven.model.Education;
import be.dog.d.steven.model.SalaryGrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BeanScopeController {

    @Autowired
    @Qualifier("salaryGrade")
    SalaryGrade salaryGrade;

    @Autowired
    @Qualifier("education")
    Education education;

    @GetMapping("/salgrade1")
    public String processRequestBeans(Model model){

        salaryGrade.setGrade("SG-45");
        salaryGrade.setRate(50000.00);
        education.setDegree("Programming");
        education.setMajor("Business Engineering");
        education.setInstitution("Self Thought");
        model.addAttribute("salaryGrade", salaryGrade);
        model.addAttribute("education", education);

        return "beanscopes1";
    }
}
