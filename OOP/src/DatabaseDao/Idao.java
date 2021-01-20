/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseDao;

/**
 *
 * @author Ad
 */
public interface Idao {

    public boolean insert(Object row);

    public boolean update(Object row);

    public boolean delete(Object row);
}
