
package practica_semana4_Aterrizable;

public class Helicoptero extends Volador implements Aterrizable {

	private String color;
	private Integer hp;
	private Piloto piloto1;
	
	public Helicoptero(String nombre, String color, Integer hp, Piloto piloto1) {
		super(nombre);
		this.color = color;
		this.hp = hp;
		this.piloto1 = piloto1;
	}
	public void aterrizar() {
		
		System.out.println("Helicoptero: " + this.getNombre() + " listo para aterrizar");
		
	}
}