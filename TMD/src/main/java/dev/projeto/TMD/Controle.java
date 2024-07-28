package dev.projeto.TMD;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/pesquisa")
    public String pesquisa(Model model){
        return "pesquisa";
    }
}