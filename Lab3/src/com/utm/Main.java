package com.utm;

import com.utm.adapter.TechniqueAdapter;
import com.utm.facade.FurnitureCustomizer;
import com.utm.factory.*;
import com.utm.furniture.Furniture;
import com.utm.iterator.House;
import com.utm.technique.PC;
import com.utm.technique.Playstation;
import com.utm.technique.TV;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        BaseFurnitureFactory cyberPunkFactory = CyberPunkFurnitureFactory.getCyberPunkFurnitureFactoryFactory();
        TV tv = new TV();
        Playstation ps5 = new Playstation();
        PC predator = new PC();
        TechniqueAdapter tvAdapter = new TechniqueAdapter(tv);
        TechniqueAdapter ps5Adapter = new TechniqueAdapter(ps5);
        TechniqueAdapter pcAdapter = new TechniqueAdapter(predator);
        House house = House.getHouse();
        house.arrangeHouse(tvAdapter,ps5Adapter,pcAdapter
                ,cyberPunkFactory.createFurniture("sofa")
                ,cyberPunkFactory.createFurniture("chair")
                ,cyberPunkFactory.createFurniture("table"));

        System.out.println("\n-----------------------------------------------------------------------\n");

        FurnitureCustomizer customizer = new FurnitureCustomizer(cyberPunkFactory);


        System.out.println(customizer.getCustomFurniture("sofa", "pink", "My Style"));
        System.out.println(customizer.getCustomFurniture("chair", "blue", "Custom Style"));
        System.out.println(customizer.getCustomFurniture("table", "red", "My own style"));


        System.out.println(cyberPunkFactory.createFurniture("chair").toString());
        System.out.println(cyberPunkFactory.createFurniture("sofa").toString());
        System.out.println(cyberPunkFactory.createFurniture("table").toString());

        BaseFurnitureFactory artDecoFactory = ArtDecoFurnitureFactory.getArtDecoFurnitureFactory();
        System.out.println(artDecoFactory.createFurniture("chair").toString());
        System.out.println(artDecoFactory.createFurniture("sofa").toString());
        System.out.println(artDecoFactory.createFurniture("table").toString());

        BaseFurnitureFactory moderFactory = ModerFurnitureFactory.getModerFurnitureFactory();
        System.out.println(moderFactory.createFurniture("chair").toString());
        System.out.println(moderFactory.createFurniture("sofa").toString());
        System.out.println(moderFactory.createFurniture("table").toString());

        house.addFurniture(tvAdapter);
        house.addFurniture(ps5Adapter);
        house.addFurniture(pcAdapter);
        house.addFurniture(cyberPunkFactory.createFurniture("sofa"));
        house.addFurniture(cyberPunkFactory.createFurniture("chair"));
        house.addFurniture(cyberPunkFactory.createFurniture("table"));
        house.addFurniture(customizer.getCustomFurniture("sofa", "blackPink", "In Your Area"));

        printFurnitureObjects(house.iterator());
    }

    private static void printFurnitureObjects(Iterator<Furniture> iterator) {
        System.out.println("House contain next objects:");
        System.out.println("\n///////////////////////////////////////////////////////////////////////////////////////\n");
        while (iterator.hasNext()) {
            Furniture furniture = iterator.next();
            System.out.println(furniture.toString());
        }
        System.out.println("\n///////////////////////////////////////////////////////////////////////////////////////");
    }
}
