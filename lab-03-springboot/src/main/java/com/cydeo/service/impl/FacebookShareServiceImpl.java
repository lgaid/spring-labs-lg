package com.cydeo.service.impl;


import com.cydeo.model.Recipe;
import com.cydeo.service.ShareService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FacebookShareServiceImpl implements ShareService {


    @Override
    public boolean share(Recipe recipe) {

        System.out.println("Shared on facebook");
        System.out.println("Recipe Type: " + recipe.getRecipeType());
        System.out.println("Recipe Name: " + recipe.getName());
        System.out.println("Ingredient List ");
        recipe.getIngredients().forEach(ingredient ->{
            System.out.println(" Ingredients Name: " + ingredient.getName());
        } );
        System.out.println(" Preparation: \n" + "\t0" + recipe.getPreparation()   );

        return true;
    }



}
