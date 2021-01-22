package com.silth.payment;

import com.silth.model.MySqlProduct;

public class Payment {
    public void pay(String produto) {
        MySqlProduct mySqlProduct = new MySqlProduct();
        System.out.println(mySqlProduct.getProduct(produto));

    }
}
