package com.ecom.model.dbmodel;


import lombok.Data;
import org.springframework.data.annotation.Id;

public @Data class Product {

    @Id
    private String productId;
    private String productName;
    private Integer productQuantity;
    private float price;
    private float discountPercent;
}
