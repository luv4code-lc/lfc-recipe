package com.luv4code.lfc.controller;

import com.luv4code.lfc.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping({"/", "/index", "/index.html"})
    public String showIndexPage(Model model) {
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
