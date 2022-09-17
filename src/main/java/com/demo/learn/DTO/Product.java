package com.demo.learn.DTO;

public class Product {
    private long id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;
    public Rating rating;

    /**
     * all args constructor
     * @param id
     * @param title
     * @param price
     * @param description
     * @param category
     * @param image
     * @param rating
     */
    public Product(long id, String title, double price, String description, String category, String image, Rating rating) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.category = category;
        this.image = image;
        this.rating = rating;
    }

    /**
     * no args constructor
     */
    public Product() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if(id<0) {
            throw new RuntimeException("Id must be positive");
        }
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
}
