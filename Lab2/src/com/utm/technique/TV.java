package com.utm.technique;

public class TV implements Technique{
    private String name = "TV";
    private String brand = "SAMSUNG";
    private float price = 10000f;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TV { " +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price + "$ " +
                '}';
    }
}
