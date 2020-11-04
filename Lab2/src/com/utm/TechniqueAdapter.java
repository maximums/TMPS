package com.utm;

import com.utm.furniture.Furniture;
import com.utm.technique.Technique;

public class TechniqueAdapter implements Furniture {

    private final Technique object;

    public TechniqueAdapter(Technique technique){
        this.object =  technique;
    }

    @Override
    public String toString() {
        return object.toString();
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setStyle(String style) {

    }

    @Override
    public void setPrice(float price) {

    }

    @Override
    public void setColor(String color) {

    }
}
