package com.silth.payment;

import com.silth.DBFactory;
import com.silth.EnumDB;
import com.silth.model.IDb;
import com.silth.model.MySqlProduct;

public class Payment {
    public void pay(String produto) {
        IDb mySqlProduct = DBFactory.getDB(EnumDB.SQLSERVER);
        System.out.println(mySqlProduct.getProduct(produto));

    }
}
