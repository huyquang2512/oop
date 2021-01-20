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
public class Category extends baseRow{
    String description;

    public Category(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

//    public String getDescription() {
//        return description;
//    }

    public void setDescription(String description) {
        this.description = description;
    } 


    public String getDescription() {
      return description;
    }
}
