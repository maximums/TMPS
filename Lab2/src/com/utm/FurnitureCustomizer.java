package com.utm;

import com.utm.factory.BaseFurnitureFactory;
import com.utm.factory.wrappers.BaseFurnitureFactoryDecorator;
import com.utm.factory.wrappers.ColorSetter;
import com.utm.furniture.Furniture;


public class FurnitureCustomizer {

    private final BaseFurnitureFactory  furnitureFactory;

    public FurnitureCustomizer(BaseFurnitureFactory furnitureFactory) {
        this.furnitureFactory = furnitureFactory;
    }

    public Furniture getCustomFurniture(String type, String customColor) {
        BaseFurnitureFactoryDecorator customFurniture = new ColorSetter(furnitureFactory, customColor);
        return customFurniture.createFurniture(type);
    }
}
