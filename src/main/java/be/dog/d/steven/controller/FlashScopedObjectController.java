package be.dog.d.steven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class FlashScopedObjectController {

    // OLD

    @GetMapping("/old_login")
    public String oldLogin(){
        return "old_login";
    }

    @PostMapping("/old_jump_page")
    public RedirectView redirectView(RedirectAttributes atts,
                                     @RequestParam("username") String username,
                                     @RequestParam("password") String password){
        atts.addFlashAttribute("username", username);
        atts.addFlashAttribute("password", password);
        atts.addFlashAttribute("request", "loginform");
        return new RedirectView("/redirectViewOld", true);
    }

    @GetMapping("/redirectViewOld")
    public String resultPageOld(Model model){
        return "old_result_page";
    }


    // NEW

    @GetMapping("/new_login")
    public String newLogin(){
        return "new_login";
    }

    @PostMapping("/new_jump_page")
    public ModelAndView modelAndView(ModelMap atts,
                                     @RequestParam("username") String username,
                                     @RequestParam("password") String password){
        atts.addAttribute("username", username);
        atts.addAttribute("password", password);
        atts.addAttribute("request", "loginform");
        return  new ModelAndView("redirect:/redirectViewNew");
    }

    @GetMapping("/redirectViewNew")
    public String resultPageNew(Model model,
                                @ModelAttribute("username") String username,
                                @ModelAttribute("password") String password,
                                @ModelAttribute("request") String loginform
    ){
        model.addAttribute("username", username);
        model.addAttribute("password", password);
        model.addAttribute("request", loginform);
        return "new_result_page";
    }

}
