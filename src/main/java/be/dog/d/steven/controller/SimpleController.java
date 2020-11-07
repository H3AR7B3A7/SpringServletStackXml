package be.dog.d.steven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ResourceBundle;

@Controller
@RequestMapping("/simple")
public class SimpleController {

    @GetMapping
    public String processGetRequest(Model model){
        String transactionType = ResourceBundle.getBundle("messages").getString("get_page");
        model.addAttribute("transactionType", transactionType);
        return "get";
    }

    @PostMapping
    public String precessPostRequest(Model model){
        String transactionType = ResourceBundle.getBundle("messages").getString("post_page");
        model.addAttribute("transactionType", transactionType);
        return "post";
    }
}
