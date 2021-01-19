/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dd.quanghuy.entity;

/**
 *
 * @author Ad
 */
public class Product extends baseRow{
    int quality;
    int categoryID;

    public Product(int id, String name, int quality, int categoryID) {
        this.id = id;
        this.name = name;
        this.quality = quality;
        this.categoryID = categoryID;
    }

    public Product() {
      
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }
}
