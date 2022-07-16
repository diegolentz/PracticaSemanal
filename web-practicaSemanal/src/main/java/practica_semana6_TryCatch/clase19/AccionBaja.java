
package practica_semana6_TryCatch.clase19;

import practica_semana6_TryCatch.Excepcionese.ErrorBorrar;
import  practica_semana6_TryCatch.clase7.Articulo;

public class AccionBaja implements IAccion {
	
	
	
	public void exec(Articulo art) {
		
		try {
			InMemoryDB.delete(art.getId());
		} catch (ErrorBorrar e) {
			e.printStackTrace();
		}
		
		System.out.println("Articulo con id: " + art.getId() + " eliminado");
	}

}