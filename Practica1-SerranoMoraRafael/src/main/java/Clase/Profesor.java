package Clase;

import java.util.Date;

public class Profesor {
	
	private String nombre;
	private int edad;
	private String identificacion;
	private String conocimiento;
	private String especialidad;
	
	//Implementacion de contructor
	public Profesor() {
		
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
	public String getConocimiento() {
		return conocimiento;
	}
	public void setConocimiento(String conocimiento) {
		this.conocimiento = conocimiento;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	//Implementacion de toString
	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", edad=" + edad + ", identificacion=" + identificacion
				+ ", conocimiento=" + conocimiento + ", especialidad=" + especialidad + "]";
	}
	
	//Declaramos los metodos pero sin funcionalidad
	public int calcularEdad(Date fechaActual) {
		return 0;
	}
	public boolean esMayorDeEdad(int limiteEdad) {
		return false;
	}

}
