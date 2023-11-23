package com.Workintech.store.Products;

import com.Workintech.store.enums.productType;

public class Chocolate extends ProductForSale{

    private String chocolateType;
    public Chocolate(productType type, double price, String description,String chocolateType) {
        super(type, price, description);
        this.chocolateType=chocolateType;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString()+this);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "chocolateType='" + chocolateType + '\'' +
                '}';
    }
}
