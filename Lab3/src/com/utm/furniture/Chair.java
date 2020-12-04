package com.utm.furniture;

public class Chair implements Furniture {
    private String name;
    private String style;
    private String color = "standard";
    private float price;

    public void setName(String name) {
        this.name = name;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Chair { " +
                "name='" + name + '\'' +
                ", style='" + style + '\'' +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                "$ }";
    }
}
