package com.Workintech.store.Products;

import com.Workintech.store.enums.productType;

public class Bread extends ProductForSale{

    private String breadType;

    public Bread(productType type, double price, String description,String breadType) {
        super(type, price, description);
        this.breadType=breadType;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString()+this);

    }

    @Override
    public String toString() {
        return "Bread{" +
                "breadType='" + breadType + '\'' +
                '}';
    }
}
