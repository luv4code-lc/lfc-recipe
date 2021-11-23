package com.luv4code.lfc.services;

import com.luv4code.lfc.commands.RecipeCommand;
import com.luv4code.lfc.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(Long id);
}
