/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseDao;

import com.dd.quanghuy.entity.Accsessory;

/**
 *
 * @author Ad
 */
public abstract class BaseDao {

    final String CATEGORY = "category";
    final String PRODUCT = "product";
    final String ACCSESSORY = "accsessory";
    Database db = new Database();

    public boolean insert1(Object row) {
        if (db.insertTable(ACCSESSORY, row) == 1) {
            return true;
        }

        return false;
    }

    public boolean update(Object row) {
        if (db.updateTable(ACCSESSORY, row) == 1) {
            return true;
        }

        return false;
    }

    public boolean delete(Object row) {
        if (db.deleteTable(ACCSESSORY, row) == true) {
            return true;
        }

        return false;
    }
}
