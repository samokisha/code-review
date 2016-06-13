package com.samokisha.code.review.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(ModelMap model,
                       @RequestParam(value = "name", required = false) String name) {

        if (name != null) {
            model.addAttribute("name", name);
        }

        return "home";
    }
}
