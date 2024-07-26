package dev.projeto.TMD;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class Controle {

    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("message", "Está funcionando!");
        return "index"; // Thymeleaf
    }
    @GetMapping("/calculadora")
    public String calculadora(Model model) {
        return "calculadora"; // Thymeleaf
    }

}
