package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomController {

    @GetMapping("showRandom")
    @ResponseBody
    public String random() {
        int number = new Random().nextInt(100);
        return "Wylosowano liczbę: " + number;
    }


    @GetMapping("/random/{max}")
    @ResponseBody
    public String getRandomWithMax(@PathVariable("max") int max) {
        int number = new Random().nextInt(max) + 1;
        return "Użytkownik podał wartość: " + max + ". Wylosowano liczbę: " + number;
    }
}
