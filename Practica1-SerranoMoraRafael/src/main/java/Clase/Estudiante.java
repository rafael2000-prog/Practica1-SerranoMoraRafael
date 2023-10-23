package Clase;

import java.util.Date;

public class Estudiante {
	
	private String nombre;
	private int edad;
	private String identificacion;
	
	//Implementacion de constructor
	public Estudiante() {
		
	}
	
	//Implementacion de Getter y Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	
	//Implementacion de toString
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", identificacion=" + identificacion + "]";
	}
	
	//Declaramos los metodos pero sin funcionalidad
	public int calcularEdad(Date fechaActual) {
		return 0;
	}
	public boolean esMayorDeEdad(int limiteEdad) {
		return false;
	}
	

}
