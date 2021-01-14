/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import DatabaseDao.Database;
import com.dd.quanghuy.demo.DatabaseDemo;
import com.dd.quanghuy.entity.Accsessory;
import com.dd.quanghuy.entity.Category;
import com.dd.quanghuy.entity.Product;
import java.util.ArrayList;

/**
 *
 * @author Ad
 */
public class OOP {

    public static void main(String[] args) {
        Database a = new Database();
        DatabaseDemo databasedemo = new DatabaseDemo();
        // insert product
        Product product = new Product(1, "CPU", 3, 4);
        databasedemo.insertTableTest("product", product);
        Product product2 = new Product(2, "CPUdie", 3, 4);
        databasedemo.insertTableTest("product", product2);
        for (int i = 0; i < a.productTable.size(); i++) {
            System.out.println("Product : Productid - " + a.productTable.get(i).getId() + "   ProductName - " + a.productTable.get(i).getName() + "  Quality - " + a.productTable.get(i).getQuality() + "   CategoryID -  " + a.productTable.get(i).getCategoryID());

        }
        // insert category
        Category category = new Category(1, "Hoang", "Nhật");
        Category category2 = new Category(2, "Hoang", "Nhật");
        databasedemo.insertTableTest("category", category);
        databasedemo.insertTableTest("category", category2);
        for (int i = 0; i < a.categoryTable.size(); i++) {
            System.out.println("Category : CategoryID - " + a.categoryTable.get(0).getId() + "   categoryName - " + a.categoryTable.get(0).getName() + "  Description - " + a.categoryTable.get(0).getDescription());
        }
        // insert Accsessory
        Accsessory accsessory = new Accsessory(1, "Headphone");
        Accsessory accsessory2 = new Accsessory(2, "Headphone");
        databasedemo.insertTableTest("accessory", accsessory);
        databasedemo.insertTableTest("accessory", accsessory2);
        for (int i = 0; i < a.accessoryTable.size(); i++) {
            System.out.println("Accsessory : accsessoryID - " + a.accessoryTable.get(0).getId() + "   accsessoryName - " + a.accessoryTable.get(0).getName());
        }
        System.out.println("----------------------------------------------------------------------------------");
        // update product
        Product productUpdate = new Product(1, "CPU2", 3, 4);
        databasedemo.updateTableTest("product", productUpdate);
        System.out.println("Product : Productid - " + a.productTable.get(0).getId() + "   ProductName - " + a.productTable.get(0).getName() + "  Quality - " + a.productTable.get(0).getQuality() + "   CategoryID -  " + a.productTable.get(0).getCategoryID());

        // update category
        Category categoryUpdate = new Category(1, "Hoang", "Huy");
        databasedemo.updateTableTest("category", categoryUpdate);
        System.out.println("Category : CategoryID - " + a.categoryTable.get(0).getId() + "   categoryName - " + a.categoryTable.get(0).getName() + "  Description - " + a.categoryTable.get(0).getDescription());

        // update accessory
        Accsessory accsessoryUpdate = new Accsessory(1, "Headphone244444");
        databasedemo.updateTableTest("accessory", accsessoryUpdate);
        System.out.println("Accsessory : accsessoryID - " + a.accessoryTable.get(0).getId() + "   accsessoryName - " + a.accessoryTable.get(0).getName());
        System.out.println("----------------------------------------------------------------------------------");
        //  delete product
        Product productDelete = new Product(1, "CPUdie", 3, 4);
        databasedemo.deleteTableTest("product", productDelete);
        for (int i = 0; i < a.productTable.size(); i++) {
            System.out.println("Product : Productid - " + a.productTable.get(i).getId() + "   ProductName - " + a.productTable.get(i).getName() + "  Quality - " + a.productTable.get(i).getQuality() + "   CategoryID -  " + a.productTable.get(i).getCategoryID());
        }
        //  delete category
        Category categoryDelete = new Category(1, "Hoang", "Nhật");
        databasedemo.deleteTableTest("category", categoryDelete);
        for (int i = 0; i < a.categoryTable.size(); i++) {
            System.out.println("Category : CategoryID - " + a.categoryTable.get(i).getId() + "   CategoryName - " + a.categoryTable.get(i).getName() + "  Desception - " + a.categoryTable.get(i).getDescription());
        }
        //  delete accsessory
        Accsessory accsessoryDelete = new Accsessory(1, "Hoang");
        databasedemo.deleteTableTest("accessory", accsessoryDelete);
        for (int i = 0; i < a.accessoryTable.size(); i++) {
            System.out.println("accsessory : accsessoryID - " + a.accessoryTable.get(i).getId() + "   accsessoryName - " + a.accessoryTable.get(i).getName());
        }
          System.out.println("----------------------------------------------------------------------------------");
       
       
        databasedemo.truncateTable("accessory");
        databasedemo.truncateTable("product");
        databasedemo.truncateTable("category");
       databasedemo.printTable();
              
        
    }
}
