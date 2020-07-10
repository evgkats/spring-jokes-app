package demo.springframework.jokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisQuotes {

    @RequestMapping("/")
    public String getRandomQuote(Model model) {
        model.addAttribute("joke", "test-joke");
        return "chucknorris";
    }
}
