package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by oracle on 8/7/17.
 */

@Controller
public class HomeController {

    @Autowired // instantiates class PersonRepository; makes variable personRepository available to all methods
    PersonRepository personRepository;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/list")
    public String listPeople(Model model){
        model.addAttribute("people", personRepository.findAll());
        return "listpeople";
    }
}
