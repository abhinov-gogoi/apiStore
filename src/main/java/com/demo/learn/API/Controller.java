package com.demo.learn.API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

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

    @GetMapping("/product")
    public String getProduct() {
        return "{\"id\":1,\"title\":\"Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops\",\"price\":109.95,\"description\":\"Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday\",\"category\":\"men's clothing\",\"image\":\"https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg\",\"rating\":{\"rate\":3.9,\"count\":120}}";
    }

}
