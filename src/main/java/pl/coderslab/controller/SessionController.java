package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDateTime;

@Controller
@SessionAttributes("loginStart")
public class SessionController {

    @GetMapping("/session")
    @ResponseBody
    public String mySession(Model model) {
        // sprawdzamy czy w modelu jest nasz atrybut loginStart
        if (model.containsAttribute("loginStart")) {

            // jeżeli jest to zwracamy go użytkownikowi
            return (String) model.asMap().get("loginStart"); // Map<String, Object>
        }

        // a jeżeli nie ma to tworzymy nowy atrybut
        String datetime = LocalDateTime.now().toString();
        model.addAttribute("loginStart", datetime);

        // i również zwracamy ten nowy artybut
        return datetime;
    }
}
