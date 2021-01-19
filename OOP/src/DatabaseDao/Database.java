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

    final String PRODUCT_NAME = "product";
    final String CATEGORY_NAME = "category";
    final String ACCSESSORY_NAME = "accessory";

    public static List<Product> productTable = new ArrayList<Product>();
    public static List<Category> categoryTable = new ArrayList<Category>();
    public static List<Accsessory> accessoryTable = new ArrayList<Accsessory>();
    public Database instants;

    public int insertTable(String name, Object row) {
        int checkAction = 0;
        if (name == PRODUCT_NAME) {
            productTable.add((Product) row);
            checkAction = 1;
        }
        if (name == CATEGORY_NAME) {
            categoryTable.add((Category) row);
            checkAction = 1;
        }
        if (name == ACCSESSORY_NAME) {
            accessoryTable.add((Accsessory) row);
            checkAction = 1;
        }

        return checkAction;
    }

    public int updateTable(String name, Object row) {
        int checkAction = 0;
        if (name == PRODUCT_NAME) {
            Product productUpdate = (Product) row;
            for (Product products : productTable) {
                if (products.getId() == productUpdate.getId()) {
                    productTable.set(productTable.indexOf(products), productUpdate);
                    checkAction = 1;
                }
            }
        }

        if (name == CATEGORY_NAME) {
            Category categoryUpdate = (Category) row;
            for (Category categorys : categoryTable) {
                if (categorys.getId() == categoryUpdate.getId()) {
                    categoryTable.set(categoryTable.indexOf(categorys), categoryUpdate);
                    checkAction = 1;
                }
            }
        }

        if (name == ACCSESSORY_NAME) {
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
        if (name == PRODUCT_NAME) {
            Product productDelete = (Product) row;
            for (Product product : productTable) {
                if (product.getId() == productDelete.getId()) {
                    productDelete = product;
                }
            }
            productTable.remove(productDelete);
            checkAction = true;
        }

        if (name == CATEGORY_NAME) {
            Category categotyDelete = (Category) row;
            for (Category category : categoryTable) {
                if (category.getId() == categotyDelete.getId()) {
                    categotyDelete = category;
                }
            }
            categoryTable.remove(categotyDelete);
            checkAction = true;
        }

        if (name == ACCSESSORY_NAME) {
            Accsessory accessoryDelete = (Accsessory) row;
            for (Accsessory accessory : accessoryTable) {
                if (accessory.getId() == accessoryDelete.getId()) {
                    accessoryDelete = accessory;
                }
            }
            accessoryTable.remove(accessoryDelete);
            checkAction = true;
        }

        return checkAction;
    }

    public void truncateTable(String name) {
        if (name == PRODUCT_NAME) {
            productTable.clear();
        }

        if (name == CATEGORY_NAME) {
            categoryTable.clear();
        }

        if (name == ACCSESSORY_NAME) {
            categoryTable.clear();
        }
    }
}
