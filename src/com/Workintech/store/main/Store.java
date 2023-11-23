package com.Workintech.store.main;

import com.Workintech.store.Products.Bread;
import com.Workintech.store.Products.Chocolate;
import com.Workintech.store.Products.Coke;
import com.Workintech.store.Products.ProductForSale;
import com.Workintech.store.enums.productType;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] sales = new ProductForSale[3];

        sales[0]= new Chocolate(productType.FOOD,22.2,"Common chocolate","bitter");
        sales[1]= new Bread(productType.FOOD,12.2,"Common bread","wheat");
        sales[2]= new Coke(productType.BEVERAGE,25.3,"Sugarfree coke",false);

        listProducts(sales);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product:products){
            product.showDetails();
        }
    }
}