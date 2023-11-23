package com.Workintech.store.Products;

import com.Workintech.store.enums.productType;

public class Coke extends ProductForSale{

    private boolean sugarType;
    public Coke(productType type, double price, String description,boolean sugarType) {
        super(type, price, description);
        this.sugarType=sugarType;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString()+this);
    }

    @Override
    public String toString() {
        return "Coke{" +
                "sugarType='" + sugarType + '\'' +
                '}';
    }
}
