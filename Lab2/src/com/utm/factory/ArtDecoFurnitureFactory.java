package com.utm.factory;

import com.utm.Director;
import com.utm.furniture.builder.ChairBuilder;
import com.utm.furniture.builder.SofaBuilder;
import com.utm.furniture.builder.TableBuilder;
import com.utm.furniture.Furniture;

public class ArtDecoFurnitureFactory implements BaseFurnitureFactory {

    private static volatile ArtDecoFurnitureFactory artDecoFurnitureFactory;
    private final Director director = new Director();

    private ArtDecoFurnitureFactory () {}

    public static ArtDecoFurnitureFactory getArtDecoFurnitureFactory() {
        if (artDecoFurnitureFactory == null)
            synchronized (ArtDecoFurnitureFactory.class) {
                if (artDecoFurnitureFactory == null)
                    artDecoFurnitureFactory = new ArtDecoFurnitureFactory();
            }
        return artDecoFurnitureFactory;
    }

    @Override
    public Furniture createFurniture(String type) {
        switch (type) {
            case "chair":
                ChairBuilder chairBuilder = new ChairBuilder();
                director.makeArtDecoChair(chairBuilder);
                return chairBuilder.getProduct();
            case "sofa":
                SofaBuilder sofaBuilder = new SofaBuilder();
                director.makeArtDecoSofa(sofaBuilder);
                return sofaBuilder.getProduct();
            case "table":
                TableBuilder tableBuilder = new TableBuilder();
                director.makeArtDecoTable(tableBuilder);
                return tableBuilder.getProduct();
            default:
                return  null;
        }
    }
}
