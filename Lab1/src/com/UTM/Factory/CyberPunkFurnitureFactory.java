package com.UTM.Factory;

import com.UTM.Director;
import com.UTM.Furniture.Builder.ChairBuilder;
import com.UTM.Furniture.Builder.SofaBuilder;
import com.UTM.Furniture.Builder.TableBuilder;
import com.UTM.Furniture.Furniture;

public class CyberPunkFurnitureFactory implements BaseFactory{

    private static volatile CyberPunkFurnitureFactory cyberPunkFurnitureFactory;
    private Director director = new Director();

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
