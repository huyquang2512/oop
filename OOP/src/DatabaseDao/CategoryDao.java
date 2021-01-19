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
public class CategoryDao extends BaseDao {

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
        for (Category category : Database.categoryTable) {
            System.out.println(category.getId() + "    " + category.getName() + "    " + category.getDescription());
        }
    }
}
