/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dd.quanghuy.demo;

import DatabaseDao.AccsessoryDao;

/**
 *
 * @author Ad
 */
public class AccsessoryDaoDemo {
   final String Category = "category";
    AccsessoryDao accsessory = new AccsessoryDao();
    
    public void insertTest(Object row) {
        accsessory.insert(row);
    }

    public void updateTest(Object row) {
        accsessory.update(row);
    }

    public void deleteTest(Object row) {
        accsessory.delete(row);
    }
    
    public void printTest(){
        accsessory.print();
    }
}
