package com.utm.factory;

import com.utm.furniture.Furniture;

public interface BaseFurnitureFactory {
    Furniture createFurniture(String type);
}
