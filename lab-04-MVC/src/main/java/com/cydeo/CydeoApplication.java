package com.cydeo;

import com.cydeo.controller.ProductController;
import com.cydeo.service.CartService;
import com.cydeo.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.xml.catalog.Catalog;


@SpringBootApplication
public class CydeoApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(CydeoApplication.class,args);
        ProductService productService = context.getBean(ProductService.class);
        productService.initialiseProductList();

        CartService cartService = context.getBean(CartService.class);
        cartService.initialiseCartList();




    }



}
