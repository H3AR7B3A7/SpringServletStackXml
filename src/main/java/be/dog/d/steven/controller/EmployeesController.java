package be.dog.d.steven.controller;

import be.dog.d.steven.service.MongoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeesController {

    @GetMapping
    public String getEmployees(Model model){

        System.out.println("test" + MongoService.getAll());
        model.addAttribute("DATA", MongoService.getAll());

        return "employees";
    }
}
