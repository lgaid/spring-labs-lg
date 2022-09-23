package com.cydeo.lab04mvc.service;

import com.cydeo.lab04mvc.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProduct(String name);

    void initialiseProductList();
}
