
package ar.com.PracticaSemanal.daos;

import ar.com.PracticaSemanal.domain.Orden;

/**
 * 
 * @author LopezCar
 *
 */
public interface OrdenDao {

	//definir los metodos CRUD
	public Orden create(Orden orden);
	public Orden read(Long id);
	public Orden update(Orden ordenToUpdate);
	public Orden delete(Long id);
 }