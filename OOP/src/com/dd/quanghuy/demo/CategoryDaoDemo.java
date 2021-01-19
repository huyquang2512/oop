/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dd.quanghuy.demo;

import DatabaseDao.CategoryDao;
import DatabaseDao.Database;

/**
 *
 * @author Ad
 */
public class CategoryDaoDemo {

    final String Category = "category";
    CategoryDao categoryDao = new CategoryDao();
    
    public void insertTest(Object row) {
        categoryDao.insert1(row);
    }

    public void updateTest(Object row) {
        categoryDao.update(row);
    }

    public void deleteTest(Object row) {
        categoryDao.delete(row);
    }
    
    public void printTest(){
        categoryDao.print();
    }
}
