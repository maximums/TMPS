package com.utm.iterator;


import com.utm.furniture.Furniture;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class House implements FurnitureCollection {
    private static volatile House house;
    private List<Furniture> furnitures;

    private House() {
        furnitures = new ArrayList<>();
    }

    public static House getHouse() {
        if (house == null)
            synchronized (House.class) {
                if (house == null)
                    house = new House();
            }
        return house;
    }

    public void arrangeHouse(Furniture... furnishes){
        System.out.println("\nCreated house contain objects:\n");
        for (Furniture furniture : furnishes)
            System.out.println(furniture.toString());
    }

    public boolean addFurniture(Furniture furniture){
        return furnitures.add(furniture);
    }

    public List<Furniture> getFurnitures() {
        return furnitures;
    }

    @Override
    public Iterator<Furniture> iterator() {
        return new FurnitureIterator(furnitures);
    }
}
