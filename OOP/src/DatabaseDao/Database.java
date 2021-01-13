/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseDao;

import java.util.ArrayList;
import com.dd.quanghuy.entity.*;
import java.util.List;

/**
 *
 * @author Ad
 */
public class Database {

    public static List<Product> productTable = new ArrayList<Product>();
    public static List<Category> categoryTable = new ArrayList<Category>();
    public static List<Accsessory> accessoryTable = new ArrayList<Accsessory>();
    public Database instants;

    public int insertTable(String name, Object row) {
        
        return insertTable(name, row);
    }

    public int updateTable(String name, Object row) {
        
        return updateTable(name, row);
    }

    public boolean deleteTable(String name, Object row) {
        
        return deleteTable(name, row);
    }

    public void truncateTable(String name) {

    }
}
