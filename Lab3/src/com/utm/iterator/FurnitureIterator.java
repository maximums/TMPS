package com.utm.iterator;

import com.utm.furniture.Furniture;

import java.util.Iterator;
import java.util.List;

public class FurnitureIterator implements Iterator<Furniture> {
    private List<Furniture> furnitures;
    private int currentItem = 0;

    public FurnitureIterator(List<Furniture> furnitures) {
        this.furnitures = furnitures;
    }

    @Override
    public boolean hasNext() {
        return (currentItem < furnitures.size() && furnitures.get(currentItem) != null);
    }

    @Override
    public Furniture next() {
        return furnitures.get(currentItem++);
    }
}
