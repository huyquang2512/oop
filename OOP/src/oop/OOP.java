/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;


import com.dd.quanghuy.demo.AccsessoryDaoDemo;
import com.dd.quanghuy.demo.CategoryDaoDemo;
import com.dd.quanghuy.demo.ProductDaoDemo;
import com.dd.quanghuy.entity.Accsessory;
import com.dd.quanghuy.entity.Category;
import com.dd.quanghuy.entity.Product;
/**
 *
 * @author Ad
 */
public class OOP {

    public static void main(String[] args) {
        CategoryDaoDemo categoryDaoDemo = new CategoryDaoDemo();
        Category b = new Category(1, "Nang kieu lo buoc", "HKT");
        categoryDaoDemo.insertTest(b);
        Category c = new Category(1, "Nang kieu lo buoc", "HKT-M");
        categoryDaoDemo.updateTest(c);
        categoryDaoDemo.deleteTest(c);
        categoryDaoDemo.printTest();
        
        ProductDaoDemo productDaoDemo = new ProductDaoDemo();
        Product productdb = new Product(1, "Nang kieu lo buoc", 1, 1);
        productDaoDemo.insertTest(productdb);
        Product productdb2 = new Product(1, "Nang kieu lo222 buoc", 1, 1);
        productDaoDemo.updateTest(productdb2);
        productDaoDemo.deleteTest(productdb2);
        productDaoDemo.printTest();
        
        AccsessoryDaoDemo accsessoryDaoDemo = new AccsessoryDaoDemo();
        Accsessory accsessorydb = new Accsessory(1, "Nang kieu lo buoc");
        accsessoryDaoDemo.insertTest(accsessorydb);
        Accsessory accsessorydb2 = new Accsessory(1, "Nang kieu lo222 buoc");
        accsessoryDaoDemo.updateTest(accsessorydb2);
        accsessoryDaoDemo.deleteTest(accsessorydb2);
        accsessoryDaoDemo.printTest();
    }
}
