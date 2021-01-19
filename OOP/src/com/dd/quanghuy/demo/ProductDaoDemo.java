/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dd.quanghuy.demo;

import DatabaseDao.Database;
import DatabaseDao.ProductDao;

/**
 *
 * @author Ad
 */
public class ProductDaoDemo {
  
    
    final String Product = "product";
    ProductDao productDao = new ProductDao();

    public void insertTest(Object row) {
        productDao.insert1(row);
    }

    public void updateTest(Object row) {
        productDao.update(row);
    }

    public void deleteTest(Object row) {
        productDao.delete(row);
    }
    
    public void printTest(){
        productDao.print();
    }
}
