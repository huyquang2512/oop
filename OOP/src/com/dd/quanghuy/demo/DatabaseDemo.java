/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dd.quanghuy.demo;

import DatabaseDao.Database;
import com.dd.quanghuy.entity.Accsessory;
import com.dd.quanghuy.entity.Category;
import com.dd.quanghuy.entity.Product;

public class DatabaseDemo extends Database{

    public void insertTableTest(String name, Object row) {
        instants.insertTable(name, row);
    }

    public void updateTableTest(String name, Object row) {
        instants.updateTable(name, row);
    }

    public void deleteTableTest(String name, Object row) {
        instants.deleteTable(name, row);
    }

    public void truncateTable(String name) {
        instants.truncateTable(name);

    }

    public void printTable() {
        for (Product product : instants.productTable) {
            System.out.println(product.getName());
        }
        for (Category category : instants.categoryTable) {
            System.out.println(category.getName());
        }
        for (Accsessory accsessory : instants.accessoryTable) {
            System.out.println(accsessory.getName());
        }
    }

}
