package com.UTM.Factory;

import com.UTM.Furniture.Furniture;

public interface BaseFactory {
    Furniture createFurniture(String type);
}
