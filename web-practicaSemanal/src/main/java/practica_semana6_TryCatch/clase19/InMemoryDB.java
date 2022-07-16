
package practica_semana6_TryCatch.clase19;

import java.util.HashMap;
import java.util.Map;

import practica_semana6_TryCatch.Excepcionese.ErrorBorrar;
import practica_semana6_TryCatch.Excepcionese.ErrorGuardar;
import practica_semana6_TryCatch.Excepcionese.ErrorListarTodo;
import practica_semana6_TryCatch.Excepcionese.ErrorObtenerValor;
import practica_semana6_TryCatch.Excepcionese.ErrorSubida;
import  practica_semana6_TryCatch.clase7.Articulo;

public class InMemoryDB {

	static private Map<Long,Articulo> db = new HashMap<Long, Articulo>();
	
	public static void save(Long key,Articulo valor) throws ErrorGuardar {
		InMemoryDB.db.put(key, valor);
	}
	
	public static void update(Long key, Articulo newValue) throws ErrorSubida {
		InMemoryDB.db.replace(key,newValue);
	}
	
	public static void delete(Long key) throws ErrorBorrar {
		InMemoryDB.db.remove(key);
	}
	
	public static Articulo getById(Long key) throws ErrorObtenerValor {
		Articulo value = null;
		if(InMemoryDB.db.containsKey(key)) {
			value = InMemoryDB.db.get(key);
		}
		return value;
	}

	public static void listAll() throws ErrorListarTodo{
		System.out.println(InMemoryDB.db.values());		
	}
}