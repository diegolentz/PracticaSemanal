
package Controllers;

import java.util.List;

import ar.com.PracticaSemanal.domain.Articulo;
import ar.com.PracticaSemanal.services.ArticulosService;
import ar.com.PracticaSemanal.services.exceptions.ServiceException;
import ar.com.PracticaSemanal.services.impl.ArticulosServiceImpl;

public class ArticuloController {

	public static void main(String[] args) {
		
		//necesito el service
		ArticulosService service = new ArticulosServiceImpl();
		
		try {
			//obtengo todos los articulos
			List<Articulo> list = service.findAll();
			
			if(!list.isEmpty()) {
				
				Articulo articulo =  service.getById(list.get(0).getId());
				
				System.out.println(articulo);
				
				//QUIERO ELIMINAR 
				//service.deleteArticulo(articulo.getId());//ctrl+t
				
				//System.out.println("se ha eliminado" + articulo.getId());
				
				articulo.setStock(25l);
				articulo.setPrecio(100000d);
				
				service.update(articulo);
			}
			
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		/* dao > CRUD ok 
		 * daoimpl > 
		 * service
		 * controller
		 * */
	}

}