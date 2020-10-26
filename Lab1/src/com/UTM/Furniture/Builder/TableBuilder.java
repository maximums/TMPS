package com.UTM.Furniture.Builder;

import com.UTM.Furniture.Table;

public class TableBuilder implements FurnitureBuilder{
    private Table table;

    public TableBuilder(){
        this.reset();
    }

    @Override
    public void reset() {
        this.table = new Table();
    }

    @Override
    public void setName(String name) {
        this.table.setName(name);
    }

    @Override
    public void setStyle(String style) {
        this.table.setStyle(style);
    }

    @Override
    public void setPrice(float price) {
        this.table.setPrice(price);
    }

    public Table getProduct(){
        Table product = this.table;
        this.reset();
        return product;
    }
}
