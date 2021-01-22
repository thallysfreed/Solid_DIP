package com.silth.model;

public class SqlServerProduct implements IDb{
    @Override
    public String getProduct(String product) {
        return "SQL Server -> Exibindo produto "+product;
    }
}
