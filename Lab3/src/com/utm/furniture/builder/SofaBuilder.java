package com.utm.furniture.builder;

import com.utm.furniture.Sofa;

public class SofaBuilder implements FurnitureBuilder{
    private Sofa sofa;

    public SofaBuilder(){
        this.reset();
    }

    @Override
    public void reset() {
        this.sofa = new Sofa();
    }

    @Override
    public void setName(String name) {
        this.sofa.setName(name);
    }

    @Override
    public void setStyle(String style) {
        this.sofa.setStyle(style);
    }

    @Override
    public void setPrice(float price) {
        this.sofa.setPrice(price);
    }

    public Sofa getProduct(){
        Sofa product = this.sofa;
        this.reset();
        return product;
    }
}
