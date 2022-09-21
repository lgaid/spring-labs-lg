package com.cydeo.lab03springboot.repository;

import com.cydeo.lab03springboot.model.Product;

public interface CartRepository {

    boolean addCartDatabase(Product product, int quantity);



}
