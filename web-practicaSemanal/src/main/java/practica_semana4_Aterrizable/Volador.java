
package practica_semana4_Aterrizable;

public abstract class Volador {
	
	// atributos comunes
	
	protected String nombre;
	
	
	public Volador(String nombre) {
		this.nombre = nombre;
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "nombre: " + this.nombre;
	}
}