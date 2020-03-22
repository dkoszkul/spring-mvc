package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalTime;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/helloView")
    public String helloView(Model model) {
        String color = "black";
        String backgroundColor = "white";

        LocalTime time = LocalTime.of(2,0);

        if (time.isAfter(LocalTime.of(20, 0)) ||
                time.isBefore(LocalTime.of(8, 0))) {
            color = "white";
            backgroundColor = "black";
        }

        model.addAttribute("color", color);
        model.addAttribute("backgroundColor", backgroundColor);
        return "home";
    }
}
