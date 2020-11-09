package be.dog.d.steven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/births")
public class BirthsController {

    @GetMapping
    public String getBirths(Model model){

        // model.addAttribute("DATA", MongoService.getAllAsHtml());

        return "births";
    }
}
