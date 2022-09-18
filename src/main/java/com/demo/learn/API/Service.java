package com.demo.learn.API;

import com.demo.learn.DTO.ProductRecord;
import com.demo.learn.DTO.Rating;

import java.util.List;

public class Service {

    public static ProductRecord getProduct(int productId) {
        List<ProductRecord> all_products = Dao.getAllProducts();
        for(int i = 0; i<=all_products.size()-1; i++) {
            if(all_products.get(i).id() == productId) {
                return all_products.get(i);
            }
        }
        return null;
    }

    public static List<ProductRecord> getAllProducts() {

        return Dao.getAllProducts();

    }
}
