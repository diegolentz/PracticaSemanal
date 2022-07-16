package practica_semana4_Aterrizable;

public class CreadorDeVoladores {

	
	public static Volador[] crearVoladores() {
		Avion a = new Avion("boing",3,2, new Piloto("jose", "alvarez", 40));
		Helicoptero h = new Helicoptero("apache", "negro", 1300, new Piloto("pedro", "sand", 35));
		Superman s = new Superman("Clark Kent", 1500, "adidas");
		Ovni o = new Ovni("ovni skyblue",1500,"5.0");
		
		//??
		//de qué tipo?
		return new Volador[]{a,h,s,o};
	}
}
