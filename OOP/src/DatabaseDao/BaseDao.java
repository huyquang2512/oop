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
public abstract class BaseDao extends Database implements Idao{
    final String CATEGORY = "category";
    final String PRODUCT = "product";
    final String ACCSESSORY = "accsessory";
    

    @Override
    public boolean insert(Object row) {
        if (instants.insertTable(ACCSESSORY, row) == 1) {
            return true;
        }

        return false;
    }

    @Override
    public boolean update(Object row) {
        if (instants.updateTable(ACCSESSORY, row) == 1) {
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(Object row) {
        if (instants.deleteTable(ACCSESSORY, row) == true) {
            return true;
        }

        return false;
    }
}
