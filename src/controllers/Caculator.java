package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Caculator {

    @GetMapping
    public String test() {
        return "index";
    }

    @PostMapping("/index")
    public String calculate(@RequestParam(name = "caculate") String caculate, @RequestParam double number1,
                            @RequestParam double number2, Model model) {
        double result = 0;
        switch (caculate) {
            case "Addition(+)":
                result = number1 + number2;
                break;
            case "Subtraction(-)":
                result = number1 - number2;
                break;
            case "Multiplication(x)":
                result = number1 * number2;
                break;
            case "Division(/)":
                result = number1 / number2;
        }
        model.addAttribute("result", result);
        return "index";
    }


}
