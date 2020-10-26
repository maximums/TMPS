package com.utm.factory.wrappers;

import com.utm.factory.BaseFurnitureFactory;
import com.utm.furniture.Furniture;



public class ColorSetter extends BaseFurnitureFactoryDecorator{
    private final String customColor;

    public ColorSetter(BaseFurnitureFactory baseFurnitureFactory, String customColor) {
        super(baseFurnitureFactory);
        this.customColor = customColor;
    }

    @Override
    public Furniture createFurniture(String type) {
        Furniture furniture = super.createFurniture(type);
        furniture.setColor(this.customColor);
        return furniture;
    }

}
