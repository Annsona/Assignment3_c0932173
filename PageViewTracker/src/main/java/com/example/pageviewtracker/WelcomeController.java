package com.example.pageviewtracker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    private final PageCounter pageCounter;

    public WelcomeController(PageCounter pageCounter) {
        this.pageCounter = pageCounter;
    }

    @GetMapping("/")
    public String welcome(Model model) {
        pageCounter.increment();
        model.addAttribute("count", pageCounter.getPageCount());
        return "welcome";
    }
}
