package com.UTM.Furniture;

public class Table implements Furniture{
    private String name;
    private String style;
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
    public String toString() {
        return "Table { " +
                "name='" + name + '\'' +
                ", style='" + style + '\'' +
                ", price=" + price + "$ " +
                '}';
    }
}
