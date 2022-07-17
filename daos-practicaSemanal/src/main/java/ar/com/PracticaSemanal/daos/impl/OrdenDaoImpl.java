
package ar.com.PracticaSemanal.daos.impl;

import ar.com.PracticaSemanal.daos.OrdenDao;
import ar.com.PracticaSemanal.daos.db.ConexionDB;
import ar.com.PracticaSemanal.daos.db.exceptions.ConnectionException;
import ar.com.PracticaSemanal.domain.Orden;

public class OrdenDaoImpl implements OrdenDao {

	private ConexionDB con;
	
	public OrdenDaoImpl() {
		this.con = new ConexionDB("root", "1234");
	}
	
	@Override
	public Orden create(Orden orden) {
		
		//necesito la conexion abierta!
		try(ConexionDB con = this.con.open()) {
			orden.setId(1L);	
		}catch(ConnectionException ce) {
			//LOGUEAR EL ERRROR		
		}
		return orden;
	}

	@Override
	public Orden read(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orden update(Orden ordenToUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orden delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}