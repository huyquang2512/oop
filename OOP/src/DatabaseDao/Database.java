/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseDao;

import java.util.ArrayList;
import com.dd.quanghuy.entity.*;
import java.util.Collection;
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
    
    
    final String productName = "product";
    final String categoryName = "category";
    final String accessoryName = "accessory";
    
    public int insertTable(String name, Object row) {
        int checkAction = 0;
        if (name == productName) {
            productTable.add((Product) row);
            checkAction = 1;
        }
        if (name == categoryName) {
            categoryTable.add((Category) row);
            checkAction = 1;
        }
        if (name == accessoryName) {
            accessoryTable.add((Accsessory) row);
            checkAction = 1;
        }

        return checkAction;
    }

    public int updateTable(String name, Object row) {
        int checkAction = 0;
        if (name == productName) {
            Product productUpdate = (Product) row;
            for (Product products : productTable) {
                if (products.getId() == productUpdate.getId()) {
                    productTable.set(productTable.indexOf(products), productUpdate);
                    checkAction = 1;
                }
            }
        }

        if (name == categoryName) {
            Category categoryUpdate = (Category) row;
            for (Category categorys : categoryTable) {
                if (categorys.getId() == categoryUpdate.getId()) {
                    categoryTable.set(categoryTable.indexOf(categorys), categoryUpdate);
                    checkAction = 1;
                }
            }
        }

        if (name == accessoryName) {
            Accsessory accsessorysUpdate = (Accsessory) row;
            for (Accsessory accsessorys : accessoryTable) {
                if (accsessorys.getId() == accsessorysUpdate.getId()) {
                    accessoryTable.set(accessoryTable.indexOf(accsessorys), accsessorysUpdate);
                    checkAction = 1;
                }
            }
        }

        return checkAction;
    }

    public boolean deleteTable(String name, Object row) {
        boolean checkAction = false;
        if (name == productName) {
            Product productDelete = (Product) row;
            for (Product product : productTable) {
                if (product.getId() == productDelete.getId()) {
                    productDelete = product;
                    checkAction = true;
                }
            }
            productTable.remove(productDelete);
        }

        if (name == categoryName) {
            Category categotyDelete = (Category) row;
            for (Category category : categoryTable) {
                if (category.getId() == categotyDelete.getId()) {
                    categotyDelete = category;
                    checkAction = true;
                }
            }
            categoryTable.remove(categotyDelete);
        }

        if (name == accessoryName) {
            Accsessory accessoryDelete = (Accsessory) row;
            for (Accsessory accessory : accessoryTable) {
                if (accessory.getId() == accessoryDelete.getId()) {
                    accessoryDelete = accessory;
                    checkAction = true;
                }
            }
            accessoryTable.remove(accessoryDelete);
        }

        return checkAction;
    }

    public void truncateTable(String name) {
        if (name == productName) {
            productTable.clear();
        }

        if (name == categoryName) {
            categoryTable.clear();
        }

        if (name == accessoryName) {
            categoryTable.clear();
        }
    }
}
