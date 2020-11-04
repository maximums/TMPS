package com.utm;


import com.utm.furniture.Furniture;

public class House {
    private static volatile House house;

    private House() {}

    public static House getHouse() {
        if (house == null)
            synchronized (House.class) {
                if (house == null)
                    house = new House();
            }
        return house;
    }

    void arrangeHouse(Furniture... furnishes){
        System.out.println("\nCreated house contain objects:\n");
        for (Furniture furniture : furnishes)
            System.out.println(furniture.toString());
    }

}
