
package practica_semana4_Aterrizable;

public class Piloto {
	
	private String nombre;
	private String apellido;
	private Integer edad;

	public Piloto(String nombre, String apellido, Integer edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		
	}
	
	@Override
	public String toString() {
		return this.nombre + " " + this.apellido;
	}

}