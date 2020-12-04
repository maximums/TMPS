package com.utm.furniture;

public class NullFurniture implements Furniture{
    @Override
    public void setName(String name) {
        System.out.println("Can't set name to null object");
    }

    @Override
    public void setStyle(String style) {
        System.out.println("Can't set style to null object");
    }

    @Override
    public void setPrice(float price) {
        System.out.println("Can't set price to null object");
    }

    @Override
    public void setColor(String color) {
        System.out.println("Can't set color to null object");
    }
}
