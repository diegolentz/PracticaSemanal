
package practica_semana6_TryCatch.clase19;

import practica_semana6_TryCatch.Excepcionese.ErrorObtenerValor;
import practica_semana6_TryCatch.Excepcionese.ErrorSubida;
import  practica_semana6_TryCatch.clase7.Articulo;


public class AccionModificacion implements IAccion {

	public void exec(Articulo art) {

		Articulo art2;
		try {
			art2 = InMemoryDB.getById(art.getId());

			if (art2 != null) {
				try {
					InMemoryDB.update(art.getId(), art);
				} catch (ErrorSubida e) {
					e.printStackTrace();
				}
			}

		} catch (ErrorObtenerValor e) {
			e.printStackTrace();
		}

	}
}