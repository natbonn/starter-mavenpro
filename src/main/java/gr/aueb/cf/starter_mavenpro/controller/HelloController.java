package gr.aueb.cf.starter_mavenpro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/starter-maven")
public class HelloController {

    @GetMapping("/v1/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello Maven!!!");
        return "index";
    }

    @GetMapping("/v2/hello")
    public String hello2(Model model) {
        model.addAttribute("message", "Hello Coding!!!");
        return "index";
    }

    @GetMapping("/v1/welcome")
    public String welcome(@RequestParam(name = "username", defaultValue = "Guest") String username,
                          Model model) {
        model.addAttribute("name", username);
        return "welcome";
    }
}
