package com.cydeo.lab03springboot.service;

import com.cydeo.lab03springboot.model.Product;

public interface StockService {

    boolean checkStockIsAvailable(Product product, int quantity);

}
