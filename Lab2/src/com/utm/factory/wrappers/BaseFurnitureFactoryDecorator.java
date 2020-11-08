package com.utm.factory.wrappers;

import com.utm.factory.BaseFurnitureFactory;
import com.utm.furniture.Furniture;

public class BaseFurnitureFactoryDecorator  {

    protected BaseFurnitureFactory wrapper;

    public BaseFurnitureFactoryDecorator(BaseFurnitureFactory baseFurnitureFactory){
        this.wrapper = baseFurnitureFactory;
    }

    public Furniture createFurniture(String type) {
        return wrapper.createFurniture(type);
    }
}
