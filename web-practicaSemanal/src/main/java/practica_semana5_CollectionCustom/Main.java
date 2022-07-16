
package practica_semana5_CollectionCustom;


public class Main {

	public static void main(String[] args) {
		
		CollectionCustom nuestra_coleccion = new CollectionCustom();
		T sabrina = new T("sabrina");
		T jose = new T("jose");
		T juan = new T("juan");
		T soledad = new T("soledad");
		T horacio = new T("horacio");
		
		
		if(nuestra_coleccion.empty())
			System.out.println("la coleccion se encuentra vacia");
		else
			System.out.println("la coleccion contiene elementos");
		
		nuestra_coleccion.addFirst(sabrina);
		nuestra_coleccion.addLast(jose);
		nuestra_coleccion.addFirst(soledad);
		nuestra_coleccion.addLast(juan);
		System.out.println("el tamaño de la coleccion es de: " + nuestra_coleccion.size());
		nuestra_coleccion.imprimir();
		
		nuestra_coleccion.remove(soledad);
		System.out.println("remuevo el 1°ero");
		System.out.println("el tamaño de la coleccion es de: " + nuestra_coleccion.size());
		nuestra_coleccion.imprimir();
		
		System.out.println("agrego mas nombres");
		nuestra_coleccion.addFirst(soledad);
		nuestra_coleccion.addLast(soledad);
		nuestra_coleccion.addLast(horacio);
		nuestra_coleccion.addLast(soledad);
		System.out.println("el tamaño de la coleccion es de: " + nuestra_coleccion.size());
		nuestra_coleccion.imprimir();
		
		System.out.println("remuevo todos los nombres del mismo tipo");
		nuestra_coleccion.removeAll(soledad);
		nuestra_coleccion.imprimir();
		System.out.println("el tamaño de la coleccion es de: " + nuestra_coleccion.size());
		
		if(nuestra_coleccion.remove(soledad) == null)
			System.out.println("el objeto ha sido removido");
		else
			System.out.println("el objeto no se ha encontrado");
		if(nuestra_coleccion.remove(soledad) != null)
			System.out.println("el objeto ha sido removido");
		else
			System.out.println("el objeto no se ha encontrado");
		if(nuestra_coleccion.empty())
			System.out.println("la coleccion se encuentra vacia");
		else
			System.out.println("la coleccion contiene elementos");
		System.out.println("el tamaño de la coleccion es de: " + nuestra_coleccion.size());
	}
		
	
}