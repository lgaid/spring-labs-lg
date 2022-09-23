
package com.cydeo.lab04mvc.service;

import com.cydeo.lab04mvc.model.Cart;
import com.cydeo.lab04mvc.model.CartItem;

import java.util.List;
import java.util.UUID;

public interface CartService {
    List<Cart> retrieveCartList();

    List<CartItem> retrieveCartDetail(UUID cartId);

    void initialiseCartList();
}
