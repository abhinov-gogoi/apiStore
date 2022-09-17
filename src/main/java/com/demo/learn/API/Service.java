package com.demo.learn.API;

import com.demo.learn.DTO.ProductRecord;
import com.demo.learn.DTO.Rating;

import java.util.ArrayList;
import java.util.List;

public class Service {

    public static ProductRecord getProduct() {
        ProductRecord product = new ProductRecord(
                1,
                "fall",
                109.67,
                "Your perfect pack for everyday use",
                "men's clothing",
                "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
                new Rating(3.5, 120));
        return product;
    }

    public static List<ProductRecord> getAllProducts() {
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

        return productRecordList;
    }
}
