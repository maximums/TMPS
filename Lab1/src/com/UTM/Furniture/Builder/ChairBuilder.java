package com.UTM.Furniture.Builder;

import com.UTM.Furniture.Chair;

public class ChairBuilder implements FurnitureBuilder{
    private Chair chair;

    public ChairBuilder(){
        this.reset();
    }

    @Override
    public void reset() {
        this.chair = new Chair();
    }

    @Override
    public void setName(String name) {
        this.chair.setName(name);
    }

    @Override
    public void setStyle(String style) {
        this.chair.setStyle(style);
    }

    @Override
    public void setPrice(float price) {
        this.chair.setPrice(price);
    }

    public Chair getProduct(){
        Chair product = this.chair;
        this.reset();
        return product;
    }
}
