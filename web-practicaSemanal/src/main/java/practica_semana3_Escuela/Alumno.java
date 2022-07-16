
package practica_semana3_Escuela;

import java.util.Scanner;

public class Alumno {

	private String nombre;
	private String apellido;
	private double promedio;
	private double nota_mas_alta;
	private double nota_mas_baja;
	
	public Alumno (String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.promedio = 0;
		this.nota_mas_alta = -1;
		this.nota_mas_baja = 11;
	}
	
	public void SolicitarNotas() {
		Scanner teclado = new Scanner(System.in);
		int cant_notas;
		double suma = 0, nota;
		System.out.println("ingrese la cantidad de notas del alumno");
		cant_notas = teclado.nextInt();
		for(int i = 0; i < cant_notas; i++) {
			System.out.println("ingrese una nota");
			nota = teclado.nextDouble();
			suma += nota;
			if(nota < this.nota_mas_baja)
			{
				this.nota_mas_baja = nota;
			}
			if(nota > this.nota_mas_alta) {
				this.nota_mas_alta = nota;
			}
		}
		this.promedio = suma / cant_notas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	public double getNota_mas_alta() {
		return nota_mas_alta;
	}

	public void setNota_mas_alta(double nota_mas_alta) {
		this.nota_mas_alta = nota_mas_alta;
	}

	public double getNota_mas_baja() {
		return nota_mas_baja;
	}

	public void setNota_mas_baja(double nota_mas_baja) {
		this.nota_mas_baja = nota_mas_baja;
	}
	
	
}