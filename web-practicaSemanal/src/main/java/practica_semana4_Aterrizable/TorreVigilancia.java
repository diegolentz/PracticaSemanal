
package practica_semana4_Aterrizable;


public class TorreVigilancia {

	public static void main(String[] args) {

	
		
		Volador[] voladores = CreadorDeVoladores.crearVoladores();

		for(Volador v : voladores) {
			
			if(v instanceof Aterrizable) {
				((Aterrizable) v).aterrizar();
			}else {
				System.out.println(v+" No puede aterrizar acá...");
			}
		}
		
	}

}