package com.luv4code.lfc.controller;

import com.luv4code.lfc.domain.Category;
import com.luv4code.lfc.domain.UnitOfMeasure;
import com.luv4code.lfc.repositories.CategoryRepository;
import com.luv4code.lfc.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final CategoryRepository categoryRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }


    @GetMapping({"/", "/index", "/index.html"})
    public String showIndexPage() {
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("unitOfMeasureOptional = " + unitOfMeasureOptional.get().getId());
        System.out.println("categoryOptional = " + categoryOptional.get().getId());
        return "index";
    }
}
