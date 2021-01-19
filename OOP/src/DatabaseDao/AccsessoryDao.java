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
public class AccsessoryDao extends BaseDao{

    @Override
    public boolean insert1(Object row) {
        return super.insert1(row);
    }

    @Override
    public boolean update(Object row) {
        return super.update(row);
    }

    @Override
    public boolean delete(Object row) {
        return super.delete(row);
    }

    public void print() {
        for (Accsessory accsessory : Database.accessoryTable) {
            System.out.println(accsessory.getId() + "    " + accsessory.getName());
        }
    }
}
