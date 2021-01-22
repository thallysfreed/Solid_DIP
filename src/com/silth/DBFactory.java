package com.silth;

import com.silth.model.IDb;
import com.silth.model.MySqlProduct;
import com.silth.model.SqlServerProduct;

public class DBFactory {
    public static IDb getDB(EnumDB db){
        if(db.equals(EnumDB.MYSQL)){
            return new MySqlProduct();
        }else{
            return new SqlServerProduct();
        }
    }
}
