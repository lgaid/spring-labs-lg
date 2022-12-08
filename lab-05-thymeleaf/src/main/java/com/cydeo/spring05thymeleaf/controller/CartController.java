package com.cydeo.spring05thymeleaf.controller;


import com.cydeo.spring05thymeleaf.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cart")
public class CartController {




    @GetMapping ("/add to cart")
public String addToCart(Model model){

        model.addAttribute("product",new Product());


    return "cart/cart add to cart";


}


}




