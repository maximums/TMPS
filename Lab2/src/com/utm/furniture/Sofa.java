package com.utm.furniture;

public class Sofa implements Furniture{
    private String name;
    private String style;
    private String color = "standard";
    private float price;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sofa { " +
                "name='" + name + '\'' +
                ", style='" + style + '\'' +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                "$ }";
    }
}
