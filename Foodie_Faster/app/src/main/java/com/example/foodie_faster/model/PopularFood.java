package com.example.foodie_faster.model;

public class PopularFood {
    String name;
    String price,description,type,rating, delivery_time;
    Integer imageUrl;

    public PopularFood(String name, String price, Integer imageUrl,String delivery_time,String rating,String type,String  description) {
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
        this.description= description;
        this.rating=rating;
        this.type=type;
        this.delivery_time=delivery_time;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDelivery_time() {
        return delivery_time;
    }

    public void setDelivery_time(String delivery_time) {
        this.delivery_time = delivery_time;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
