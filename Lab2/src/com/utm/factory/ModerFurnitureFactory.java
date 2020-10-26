package com.utm.factory;

import com.utm.Director;
import com.utm.furniture.builder.ChairBuilder;
import com.utm.furniture.builder.SofaBuilder;
import com.utm.furniture.builder.TableBuilder;
import com.utm.furniture.Furniture;

public class ModerFurnitureFactory implements BaseFurnitureFactory {

    private static volatile ModerFurnitureFactory moderFurnitureFactory;
    private final Director director = new Director();

    public static ModerFurnitureFactory getModerFurnitureFactory() {
        if (moderFurnitureFactory == null)
            synchronized (ModerFurnitureFactory.class) {
                if (moderFurnitureFactory == null)
                    moderFurnitureFactory = new ModerFurnitureFactory();
            }
        return moderFurnitureFactory;
    }

    private ModerFurnitureFactory() {}

    @Override
    public Furniture createFurniture(String type) {
        switch (type) {
            case "chair":
                ChairBuilder chairBuilder = new ChairBuilder();
                director.makeModernChair(chairBuilder);
                return chairBuilder.getProduct();
            case "sofa":
                SofaBuilder sofaBuilder = new SofaBuilder();
                director.makeModernSofa(sofaBuilder);
                return sofaBuilder.getProduct();
            case "table":
                TableBuilder tableBuilder = new TableBuilder();
                director.makeModernTable(tableBuilder);
                return tableBuilder.getProduct();
            default:
                return  null;
        }
    }
}
