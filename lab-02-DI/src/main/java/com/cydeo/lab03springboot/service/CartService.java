package com.cydeo.lab03springboot.service;

import com.cydeo.lab03springboot.model.Cart;
import com.cydeo.lab03springboot.model.Product;

public interface CartService {

    Cart addCart(Product product, int quantity);


}
