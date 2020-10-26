package com.UTM.Factory;

import com.UTM.Director;
import com.UTM.Furniture.Builder.ChairBuilder;
import com.UTM.Furniture.Builder.SofaBuilder;
import com.UTM.Furniture.Builder.TableBuilder;
import com.UTM.Furniture.Furniture;

public class ArtDecoFurnitureFactory implements BaseFactory{

    private static volatile ArtDecoFurnitureFactory artDecoFurnitureFactory;
    private Director director = new Director();

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
