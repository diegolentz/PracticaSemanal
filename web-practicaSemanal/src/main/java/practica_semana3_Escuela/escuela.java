
package practica_semana3_Escuela;

/*
             La idea es practicar ciclos, dobles con vectores, máximo, mínimo, promedio.
             realizar el siguiente ejercicios:
             La escuela primaria xyz solicita el desarrollo de una aplicación para poder llevar el control de notas para cada alumno.
             El programa solicitará el ingreso la cantidad de alumnos a procesar.
             Para cada alumno se deberá ingresar los siguientes datos:
             - nombre (string)
             - apellido (string)
             - número de examen
             - nota que obtuvo el alumno (númerico >=0 <=10)
             Al finalizar la carga de datos, se procederá a listar la siguiente información:
             1- alumno/s con la calificación mas alta
             2- alumno/s con la calificación mas baja
             3- alumnos que promocionan, aquellos que obtuvieron un promedio >= 7
             4- alumnos que deben recursar la materia, aquellos que obtuvieron un promedio < 7"""
 * */

import java.util.Scanner;

public class escuela {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int cant_alumnos, cant_mayor_nota = 0, cant_menor_nota = 0;
		double mayor_nota = -1, menor_nota = 11;
		String nombre, apellido;
		System.out.println("ingrese la cantidad de alumnos ");
		cant_alumnos = teclado.nextInt();
		Alumno alumnos[] = new Alumno[cant_alumnos];
		Alumno alumnos_mayor_nota[] = new Alumno[cant_alumnos];
		Alumno alumnos_menor_nota[] = new Alumno[cant_alumnos];
		teclado.nextLine();
		for(int i = 0; i < cant_alumnos; i++) {
			System.out.println("ingrese el nombre del "+ (i+1)+ "° alumno");
			nombre = teclado.nextLine();
			System.out.println("ingrese el apellido del "+ (i+1)+ "° alumno");
			apellido = teclado.nextLine();
			alumnos[i] = new Alumno (nombre, apellido);
			alumnos[i].SolicitarNotas();
			if(alumnos[i].getNota_mas_alta() > mayor_nota) {
				alumnos_mayor_nota[0] = alumnos[i];
				cant_mayor_nota = 1;
				mayor_nota = alumnos[i].getNota_mas_alta();
			} 
			else if(alumnos[i].getNota_mas_alta() == mayor_nota) {
				alumnos_mayor_nota[cant_mayor_nota] = alumnos[i];
				cant_mayor_nota++;
			}
			if(alumnos[i].getNota_mas_baja() < menor_nota) {
				alumnos_menor_nota[0] = alumnos[i];
				cant_menor_nota = 1;
				menor_nota = alumnos[i].getNota_mas_baja();
			}
			else if(alumnos[i].getNota_mas_baja() == menor_nota) {
				alumnos_menor_nota[cant_menor_nota] = alumnos[i];
				cant_menor_nota++;
			}
		}
		System.out.println("alumnos con la nota mas alta ("+ mayor_nota + ")");
		for(int i = 0; i < cant_mayor_nota; i++) {
			System.out.println("* " + alumnos_mayor_nota[i].getNombre()+" " + alumnos_mayor_nota[i].getApellido());		
		}
		System.out.println("alumnos con la nota mas baja ("+ menor_nota + ")");
		for(int i = 0; i < cant_menor_nota; i++) {
			System.out.println("* " + alumnos_menor_nota[i].getNombre()+" " + alumnos_menor_nota[i].getApellido());		
		}
		System.out.println("alumnos que promocionaron");
		for(int i = 0; i < cant_alumnos; i++) {
			if(alumnos[i].getPromedio() >= 7) {
				System.out.println("* " + alumnos[i].getNombre()+" " + alumnos[i].getApellido());
			}
		}
		System.out.println("alumnos que deben recursar");
		for(int i = 0; i < cant_alumnos; i++) {
			if(alumnos[i].getPromedio() < 7) {
				System.out.println("* " + alumnos[i].getNombre()+" " + alumnos[i].getApellido());
			}
		}
	}
	
}