package com.utm.factory;

import com.utm.facade.Director;
import com.utm.furniture.builder.ChairBuilder;
import com.utm.furniture.builder.SofaBuilder;
import com.utm.furniture.builder.TableBuilder;
import com.utm.furniture.Furniture;

public class CyberPunkFurnitureFactory implements BaseFurnitureFactory {

    private static volatile CyberPunkFurnitureFactory cyberPunkFurnitureFactory;
    private final Director director = new Director();

    private CyberPunkFurnitureFactory() {}

    public static CyberPunkFurnitureFactory getCyberPunkFurnitureFactoryFactory() {
        if (cyberPunkFurnitureFactory == null)
            synchronized (CyberPunkFurnitureFactory.class) {
                if (cyberPunkFurnitureFactory == null)
                    cyberPunkFurnitureFactory = new CyberPunkFurnitureFactory();
            }
        return cyberPunkFurnitureFactory;
    }

    @Override
    public Furniture createFurniture(String type) {
        switch (type){
            case "chair":
                ChairBuilder chairPBuilder = new ChairBuilder();
                director.makeCyberPunkChair(chairPBuilder);
                return chairPBuilder.getProduct();
            case "sofa":
                SofaBuilder sofaPBuilder = new SofaBuilder();
                director.makeCyberPunkSofa(sofaPBuilder);
                return sofaPBuilder.getProduct();
            case "table":
                TableBuilder tablePBuilder = new TableBuilder();
                director.makeCyberPunkTable(tablePBuilder);
                return tablePBuilder.getProduct();
            default:
                return null;
        }
    }
}
