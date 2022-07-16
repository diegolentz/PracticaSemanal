
package practica_semana4_Aterrizable;

public class Superman extends Volador {
	
	private Integer horasVuelo;
	private String zapatillas;

	public Superman(String nombre, Integer horasVuelo, String zapatillas) {
		super(nombre);
		this.horasVuelo = horasVuelo;
		this.zapatillas = zapatillas;
	}
	public void aterrizar() {
		
		System.out.println("Superman: " + this.getNombre() + " listo para aterrizar");
		
		
	}


}