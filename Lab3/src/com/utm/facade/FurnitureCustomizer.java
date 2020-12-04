package com.utm.facade;

import com.utm.factory.BaseFurnitureFactory;
import com.utm.factory.wrappers.BaseFurnitureFactoryDecorator;
import com.utm.factory.wrappers.ColorCustomizer;
import com.utm.furniture.Furniture;


public class FurnitureCustomizer {

    private final BaseFurnitureFactory  furnitureFactory;

    public FurnitureCustomizer(BaseFurnitureFactory furnitureFactory) {
        this.furnitureFactory = furnitureFactory;
    }

    public Furniture getCustomFurniture(String type, String customColor, String style) {
        BaseFurnitureFactoryDecorator customizer = new ColorCustomizer(furnitureFactory, customColor);
        Furniture customFurniture = customizer.createFurniture(type);
        customFurniture.setStyle(style);
        return customFurniture;
    }
}
