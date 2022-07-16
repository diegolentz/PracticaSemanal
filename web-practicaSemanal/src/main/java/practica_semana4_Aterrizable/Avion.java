
package practica_semana4_Aterrizable;

public class Avion extends Volador implements Aterrizable {

	// atributos propios
	
	private Integer turbinas;
	private Integer asientos;
	private Piloto piloto1;
	
	
	public Avion(String nombre, Integer turbinas, Integer asientos, Piloto piloto1)
	{
		super(nombre);
		this.turbinas = turbinas;
		this.asientos = asientos;
		this.piloto1 = piloto1;
	}
    
	public void aterrizar() {
		
		System.out.println("Avion: " + this.getNombre() + " listo para aterrizar");
		
	}
	

}