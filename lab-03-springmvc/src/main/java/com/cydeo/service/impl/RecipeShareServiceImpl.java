package com.cydeo.service.impl;

import com.cydeo.enums.QuantityType;
import com.cydeo.enums.RecipeType;
import com.cydeo.model.Ingredients;
import com.cydeo.model.Recipe;
import com.cydeo.repository.RecipeRepository;
import com.cydeo.service.RecipeService;
import com.cydeo.service.ShareService;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class RecipeShareServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;
    private final ShareService shareService;
    private final Faker faker;

    public RecipeShareServiceImpl(RecipeRepository recipeRepository, ShareService shareService, Faker faker) {
        this.recipeRepository = recipeRepository;
        this.shareService = shareService;
        this.faker = faker;
    }


    @Override
    public boolean prepareRecipe() {
        for (int i = 0; i < 20; i++) {

            Arrays.stream(RecipeType.values()).forEach(recipeType -> {
                Recipe recipe = new Recipe();
                recipe.setRecipeId(UUID.randomUUID());
                recipe.setName(faker.food().dish());
                recipe.setDuration(generateRandomValue());
                recipe.setPreparation(faker.lorem().paragraph(generateRandomValue()));
                recipe.setIngredients(prepareIngredient());
                recipe.setRecipeType(recipeType);
                recipeRepository.save(recipe);
                shareService.share(recipe);

            });

        }
        return true;
    }

    private List<Ingredients> prepareIngredient() {

        List<QuantityType> quantityTypesList = List.of(QuantityType.values());
        List<Ingredients> ingredientList = new ArrayList<>();

        for (int i = 0; i < generateRandomValue(); i++) {
            Ingredients ingredient = new Ingredients();
            ingredient.setName(faker.food().ingredient());
            ingredient.setQuantity(generateRandomValue());
            ingredient.setQuantityType(quantityTypesList.get(new Random().nextInt(3)));
            ingredientList.add(ingredient);


        }
        return ingredientList;

    }

    private int generateRandomValue() {
        return new Random().nextInt(20);
    }

}