package com.utm.technique;

public class NullTechnique implements Technique{
    @Override
    public void setName(String name) {
        System.out.println("Can't set name to null object");
    }

    @Override
    public void setBrand(String brand) {
        System.out.println("Can't set brand to null object");
    }

    @Override
    public void setPrice(float price) {
        System.out.println("Can't set price to null object");
    }
}
