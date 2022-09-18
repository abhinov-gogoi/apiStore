package com.demo.learn.API;


import com.demo.learn.DTO.Product;
import com.demo.learn.DTO.ProductRecord;
import com.demo.learn.DTO.Rating;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class Controller {

    @GetMapping("hello")
    public String welcome() {
        return "Hello SpringBoot";
    }

    @GetMapping("time")
    public String showTime() {
        return "The Time is :: " + new Timestamp(System.currentTimeMillis());
    }

    @GetMapping("randomNumber")
    public double randomNumber() {
        return Math.random();
    }

//    @GetMapping("/product")
//    public String getProduct() {
//        return "{\"id\":1,\"title\":\"Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops\",\"price\":109.95,\"description\":\"Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday\",\"category\":\"men's clothing\",\"image\":\"https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg\",\"rating\":{\"rate\":3.9,\"count\":120}}";
//    }

    @GetMapping("/productHashMap")
    public Map<String, Object> getProductMap() {
        Map<String, Object> product = new HashMap<>();

        product.put("id", 1);
        product.put("title", "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops");
        product.put("price", 109.95);
        product.put("description", "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday");
        product.put("category", "men's clothing");
        product.put("image", "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg");

        Map<String, Object> rating = new HashMap<String, Object>();
        rating.put("rate", 3.5);
        rating.put("count", 120);
        product.put("rating", rating);

        return product;
    }

    @GetMapping("/productObject")
    public Product getProductObject() {
        Product product = new Product();
        product.setId(1);
        product.setTitle("Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops");
        product.setPrice(109.95);
        product.setDescription("Your perfect pack for everyday use");
        product.setCategory("men's clothing");
        product.setImage("https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg");
        Rating rating = new Rating(3.5, 120);
        product.setRating(rating);
        return product;
    }

    @GetMapping("/products")
    public List<ProductRecord> getAllProducts() {
        return Service.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public ProductRecord getProduct(@PathVariable(name = "id") Integer productId) {
        System.out.println("Product Id :: "+productId);
        ProductRecord product = Service.getProduct(productId);

        if(product == null) {
            throw new RuntimeException("Product Not Found");
        }

        return product;
    }


}
