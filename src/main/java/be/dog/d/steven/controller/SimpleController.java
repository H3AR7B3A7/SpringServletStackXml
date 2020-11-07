package be.dog.d.steven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/simple")
public class SimpleController {

    @GetMapping
    public String processGetRequest(Model model){
        String transactionType = "Simple GET Transaction";
        model.addAttribute("transactionType", transactionType);
        return "get";
    }

    @PostMapping
    public String precessPostRequest(Model model){
        String transactionType = "Simple POST Transaction";
        model.addAttribute("transactionType", transactionType);
        return "post";
    }
}
