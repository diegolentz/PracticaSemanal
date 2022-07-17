
package ar.com.PracticaSemanal.daos;


import ar.com.PracticaSemanal.daos.db.exceptions.GenericException;
import ar.com.PracticaSemanal.domain.Articulo;

/**
 * 
 * @author LopezCar
 *
 */
public interface ArticuloDao extends GenericDao<Articulo>{

	//no forma parte del crud
	public Articulo getByCode(String codigo) throws GenericException;
	
	/*between*/
 }