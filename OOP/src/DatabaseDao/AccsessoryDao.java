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
public class AccsessoryDao {

    final String Accsessory = "accsessory";
    Database db = new Database();

    public boolean insert(Object row) {
        if (db.insertTable(Accsessory, row) == 1) {
            return true;
        }

        return false;
    }

    public boolean update(Object row) {
        if (db.updateTable(Accsessory, row) == 1) {
            return true;
        }

        return false;
    }

    public boolean delete(Object row) {
        if (db.deleteTable(Accsessory, row) == true) {
            return true;
        }

        return false;
    }

    public void print() {
        for (Accsessory accsessory : Database.accessoryTable) {
            System.out.println(accsessory.getId() + "    " + accsessory.getName());
        }
    }
}
