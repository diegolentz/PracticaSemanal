
package practica_semana6_TryCatch.clase19;

import java.util.Scanner;

import practica_semana6_TryCatch.Excepcionese.ErrorBorrar;
import practica_semana6_TryCatch.Excepcionese.ErrorGuardar;
import practica_semana6_TryCatch.Excepcionese.ErrorListarTodo;
import practica_semana6_TryCatch.Excepcionese.ErrorObtenerValor;
import practica_semana6_TryCatch.Excepcionese.ErrorSubida;
import  practica_semana6_TryCatch.clase7.Articulo;
import practica_semana6_TryCatch.clase7.Libro;


public class MainMap {

	/**
	 * El usuario ingresa una opcion
	 * 1- alta
	 * 2- baja
	 * 3- modificar
	 * 4- listar
	 * @param args
	 */
	public static void main(String[] args) {
	
		Integer opcionIngresadaPorUsuario = 1;
		
		// Interface i = new ClaseQueImplementaLaInterface();		
		IAccion accion = AccionMap.getAccion(opcionIngresadaPorUsuario);//AltaAccion|BajaAccion|AccionDefault
		
		Articulo articulo = contruirArticulo();
		

		try {
			InMemoryDB.listAll();//listar
		}catch(NullPointerException e) {
			e.printStackTrace();
		}catch (ErrorListarTodo e) {}
		
		try {
			InMemoryDB.delete(articulo.getId());//borrar
		}catch (NullPointerException e) {
			e.printStackTrace();
		}catch (ErrorBorrar e) {
			e.printStackTrace();
		}
	
		try {
			InMemoryDB.getById(articulo.getId());//obtener por id
		}catch (NullPointerException e) {
			e.printStackTrace();
		}catch (ErrorObtenerValor e) {
			e.printStackTrace();
		}
		
		try {
			InMemoryDB.save(articulo.getId(), articulo);
		}catch (NullPointerException e) {
			e.printStackTrace();
		}catch (ErrorGuardar e) {
			e.printStackTrace();
		}
		
		
		
	}

	private static Articulo contruirArticulo() {
		Scanner teclado = new Scanner(System.in);
		Articulo art = new Libro();
		System.out.println("Ingrese titulo ");
		art.setAutor(teclado.next());
		System.out.println("Ingrese id ");
		art.setId(teclado.nextLong());
		
		System.out.println("Ingrese isbn");
		((Libro)art).setIsbn(teclado.next());
		teclado.close();
		return art;
	}
}