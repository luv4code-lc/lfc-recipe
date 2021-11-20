package com.luv4code.lfc.repositories;

import com.luv4code.lfc.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
