package com.androidbuts.jsonparsing.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ProductList {

    @SerializedName("products")
    @Expose
    private ArrayList<Products> products = new ArrayList<>();

    /**
     * @return The Products
     */
    public ArrayList<Products> getProducts() {
        return products;
    }

    /**
     * @param products The products
     */
    public void setProducts(ArrayList<Products> products) {
        this.products= products;
    }
}