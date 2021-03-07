package pl.coderslab.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PersonController {
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute(new Person("Marek"));
        return "szablon";
    }
}
