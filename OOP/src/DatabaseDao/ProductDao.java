/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseDao;

import com.dd.quanghuy.entity.Category;
import com.dd.quanghuy.entity.Product;

/**
 *
 * @author Ad
 */
public class ProductDao {

    final String Product = "product";
    Database db = new Database();

    public boolean insert(Object row) {
        if (db.insertTable("product", row) == 1) {
            return true;
        }

        return false;
    }

    public boolean update(Object row) {
        if (db.updateTable("product", row) == 1) {
            return true;
        }
        
        return false;
    }

    public boolean delete(Object row) {
        if (db.deleteTable("product", row) == true) {
            return true;
        }
        
        return false;
    }
    
    public void print(){
        for (Product product : Database.productTable) {
            System.out.println(product.getId() + "    " +product.getName()+ "    "+ product.getQuality()+ "    "+ product.getCategoryID());
        }
    }
}
