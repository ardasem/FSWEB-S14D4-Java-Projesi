package com.Workintech.store.Products;
import com.Workintech.store.enums.productType;

public abstract class ProductForSale {

    private productType type;
    private double price;
    private String description;

    public ProductForSale(productType type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }
    public double getSalesPrice(int quantity){
        return quantity*price;
    }

    public abstract void showDetails();

    public productType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "ProductForSale{" +
                "type=" + type +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
