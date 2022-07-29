
package Controllers;

import java.util.List;
import java.util.Scanner;

import ar.com.PracticaSemanal.domain.Articulo;
import ar.com.PracticaSemanal.services.ArticulosService;
import ar.com.PracticaSemanal.services.exceptions.ServiceException;
import ar.com.PracticaSemanal.services.impl.ArticulosServiceImpl;

public class DeleteArticuloController {

	public static void main(String[] args) throws ServiceException {
		
		ArticulosService service = new ArticulosServiceImpl();
		
		System.out.println("Articulos existentes:");
		List<Articulo> list = service.findAll();
		System.out.println(list);
		System.out.println("-------------------------");
		try(Scanner teclado = new Scanner(System.in)) {
		
			System.out.println("Ingrese id de articulo");
			
			Long id = teclado.nextLong();
			
			service.delete(id);//ctrl+t
		}
	}

}