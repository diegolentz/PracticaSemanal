
package ar.com.PracticaSemanal.web;

import ar.com.PracticaSemanal.daos.OrdenDao;
import ar.com.PracticaSemanal.daos.impl.OrdenDaoImpl;
import ar.com.PracticaSemanal.domain.Orden;

public class MainConexionDBTEst {

	public static void main(String[] args) {
		
		//dao > impl
		OrdenDao dao = new OrdenDaoImpl();
		
		//crear la orden
		Orden o = new Orden(1l,"test",150f);
		
		dao.create(o);
	}
}