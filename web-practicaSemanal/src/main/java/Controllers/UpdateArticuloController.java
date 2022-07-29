
package Controllers;

import ar.com.PracticaSemanal.domain.Articulo;
import ar.com.PracticaSemanal.services.ArticulosService;
import ar.com.PracticaSemanal.services.exceptions.ServiceException;
import ar.com.PracticaSemanal.services.impl.ArticulosServiceImpl;

public class UpdateArticuloController {

	public static void main(String[] args) throws ServiceException {
		
		ArticulosService articuloService = new ArticulosServiceImpl();

		Articulo art = articuloService.getByCodigo("med001");
		
		art.setPrecio(8500d);
		// art.setCodigo("0000003");
		
		articuloService.update(art);
	}

}