package com.cydeo.service.impl;

import com.cydeo.model.Recipe;
import com.cydeo.service.ShareService;

public class InstagramShareServiceImpl implements ShareService {


    @Override
    public boolean share(Recipe recipe) {

        System.out.println("Shared on instagram");
        System.out.println("Recipe Type: " + recipe.getRecipeType());
        System.out.println("Recipe Name: " + recipe.getName());
        System.out.println("Ingredient List ");
        recipe.getIngredients().forEach(ingredient ->{
            System.out.println(" Ingredient Name: " + ingredient.getName());
        } );
        System.out.println(" Preparation: \n" + "\t0" + recipe.getPreparation()   );

        return true;


    }
}
