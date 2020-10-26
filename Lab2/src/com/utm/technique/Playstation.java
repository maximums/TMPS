package com.utm.technique;

public class Playstation implements Technique{
    private String name = "Playstation";
    private String brand = "Sony";
    private float price = 500f;

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
        return "Playstation { " +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price + "$ " +
                '}';
    }
}
