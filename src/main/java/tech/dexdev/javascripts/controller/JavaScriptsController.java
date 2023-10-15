package tech.dexdev.javascripts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tech.dexdev.javascripts.entity.JavaScript;
import tech.dexdev.javascripts.service.JavaScriptsService;

@Controller
@RequestMapping("/notes")
public class JavaScriptsController {
    private final JavaScriptsService service;

    public JavaScriptsController(JavaScriptsService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String getJavaScriptsRender(Model model) {
        model.addAttribute("javaScripsList", service.findAll());
        return "index";
    }

    @GetMapping("/new")
    public String createJavaScriptRender(Model model) {
        JavaScript javaScript = new JavaScript();
        model.addAttribute("javaScriptNew", javaScript);
        return "create_java_script";
    }

    @PostMapping("/new")
    public String save(@ModelAttribute("javaScriptNew") JavaScript javaScript) {
        service.save(javaScript);
        return "redirect:/notes/";
    }

    @GetMapping("/update/{id}")
    public String updateJavaScriptRender(@PathVariable Long id, Model model) {
        model.addAttribute("javaScriptUpdate", service.getById(id));
        return "update_java_script";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable Long id,
                         @ModelAttribute("javaScriptUpdate") JavaScript javaScript) {
        JavaScript updatedJavaScript = service.getById(id);
        updatedJavaScript.setNote(javaScript.getNote());
        updatedJavaScript.setCategory(javaScript.getCategory());
        service.save(updatedJavaScript);
        return "redirect:/notes/";
    }

    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable Long id) {
        service.deleteById(id);
        return "redirect:/notes/";
    }

    @GetMapping("/filter/WORK")
    public String filter(//@PathVariable String category,
                         Model model) {
        model.addAttribute("category", "WORK");
//        service.filter(category);
        return "filter";
    }
}
