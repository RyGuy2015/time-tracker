package com.dpslink.dpstimeapi.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticPageController implements ErrorController {

    @RequestMapping("/error")
    public String index() {
        return "redirect:/";
    }

    @Override
    public String getErrorPath() {
        return "redirect:/";
    }
}
