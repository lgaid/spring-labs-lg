package com.cydeo.spring05thymeleaf.controller;

import com.cydeo.spring05thymeleaf.model.Product;
import com.cydeo.spring05thymeleaf.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")

public class ProductController {

    private Product product;
    private ProductService productService;



    @PostMapping("/create-form")
    public String addToCart(Model model){

        model.addAttribute("product", new Product());

        return "product/product create - form";

    }



}









