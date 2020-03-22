package pl.coderslab.examples;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExController {

    // localhost:8080?param2=12&param1=sdfdsfsdfdsf
    @GetMapping("ex1")
    @ResponseBody
    public String ex1(@RequestParam(name = "param1") String param1,
                      @RequestParam(name = "param2") Integer param2) {

        return "dsafdasd";
    }

    @GetMapping("ex1/{pageNumber}/details")
    @ResponseBody
    public String ex1(@RequestParam(name = "param1", required = false) String param1,
                      @PathVariable("pageNumber") int pageNr) {

        return "pageNr: " + pageNr + " param1: " + param1;
    }
}
