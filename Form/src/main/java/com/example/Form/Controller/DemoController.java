package com.example.Form.Controller;


import com.example.Form.Domain.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class DemoController {

    @RequestMapping("/index")
    public String home(){
        System.out.println("Going home...");
        return "index";
    }

    @GetMapping("/register")
    public String showForm(Model model){
        Client client = new Client();
        model.addAttribute("client",client);
        return "register_form.html";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("client")Client client,
                         BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "error";
        }
        System.out.println(client);

        //Do Something
        return "redirect:/register_success.html";
    }

}


