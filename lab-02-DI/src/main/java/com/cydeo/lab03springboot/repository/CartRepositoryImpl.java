package com.cydeo.lab03springboot.repository;

import com.cydeo.lab03springboot.model.Product;

public class CartRepositoryImpl implements CartRepository{

    public boolean addCartDatabase(Product product, int quantity) {
        System.out.println(product.getName() + " is added to database");
        return true;
    }

}
