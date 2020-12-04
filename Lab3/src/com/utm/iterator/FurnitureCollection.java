package com.utm.iterator;

import com.utm.furniture.Furniture;

import java.util.Iterator;

public interface FurnitureCollection {
    Iterator<Furniture> iterator();
}
