package com.cydeo.model;

import com.cydeo.enums.QuantityType;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Ingredient {

    private String name;
    private Integer quantity;
    private QuantityType quantityType;


}
