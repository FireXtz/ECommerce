package org.Emark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/comece-aqui")
public class MenuController {
    @GetMapping
    public ModelAndView  incluir(){
       ModelAndView modelAndView = new ModelAndView("menu");
       return modelAndView;
    }
}
