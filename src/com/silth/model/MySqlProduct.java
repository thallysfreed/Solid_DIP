package com.silth.model;

public class MySqlProduct implements IDb{

    @Override
    public String getProduct(String product) {
        return "Mysql->Exibindo produto "+product;
    }
}
