/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseDao;

import com.dd.quanghuy.entity.Category;
import DatabaseDao.Database;

/**
 *
 * @author Ad
 */
public class CategoryDao {

    final String Category = "category";
    Database db = new Database();

    public boolean insert(Object row) {
        if (db.insertTable(Category, row) == 1) {
            return true;
        }

        return false;
    }

    public boolean update(Object row) {
        if (db.updateTable(Category, row) == 1) {
            return true;
        }

        return false;
    }

    public boolean delete(Object row) {
        if (db.deleteTable(Category, row) == true) {
            return true;
        }

        return false;
    }
    
    public void print(){
        for (Category category : Database.categoryTable) {
            System.out.println(category.getId() + "    " +category.getName()+ "    "+ category.getDescription());
        }
    }
}
