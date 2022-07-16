
package practica_semana6_TryCatch.clase19;

import practica_semana6_TryCatch.Excepcionese.ErrorGuardar;
import  practica_semana6_TryCatch.clase7.Articulo;

public class AccionAlta implements IAccion {

	public void exec(Articulo art) {
		try {
			InMemoryDB.save(art.getId(), art);
		} catch (ErrorGuardar e) {
			e.printStackTrace();
		}
		System.out.println("Articulo con id: " + art.getId() + " agregado");
	}
}