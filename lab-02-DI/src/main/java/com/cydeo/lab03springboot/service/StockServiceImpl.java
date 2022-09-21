package com.cydeo.lab03springboot.service;

import com.cydeo.lab03springboot.model.Product;

public class StockServiceImpl implements StockService {


    @Override
    public boolean checkStockIsAvailable(Product product, int quantity) {
        return product.getRemainingQuantity() > quantity;
    }


}
