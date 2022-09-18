package com.demo.learn.API;

import com.demo.learn.DTO.ProductRecord;
import com.demo.learn.DTO.Rating;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class Dao {

    public static List<ProductRecord> ALL_PRODUCTS = new ArrayList<>();

    static {
        populateDummyProducts();
    }

    private static void populateDummyProducts() {
        List<ProductRecord> productRecordList = new ArrayList<ProductRecord>();
        ProductRecord product1 = new ProductRecord(
                1,
                "fall",
                109.67,
                "Your perfect pack for everyday use",
                "men's clothing",
                "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
                new Rating(3.5, 120));
        productRecordList.add(product1);

        ProductRecord product2 = new ProductRecord(
                2,
                "fall",
                109.67,
                "Your perfect pack for everyday use",
                "men's clothing",
                "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
                new Rating(3.5, 120));
        productRecordList.add(product2);

        ProductRecord product3 = new ProductRecord(
                3,
                "fall",
                109.67,
                "Your perfect pack for everyday use",
                "men's clothing",
                "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
                new Rating(3.5, 120));
        productRecordList.add(product3);

        Dao.ALL_PRODUCTS = productRecordList;
        System.out.println("Populated dummy products complete");
    }

    public static List<ProductRecord> getAllProducts() {
        return ALL_PRODUCTS;
    }
}
