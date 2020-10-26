package com.utm.technique;

public class PC implements Technique{
    private String name = "PC";
    private String brand = "Predator";
    private float price = 2500f;

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
        return "PC { " +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price + "$ " +
                '}';
    }
}
