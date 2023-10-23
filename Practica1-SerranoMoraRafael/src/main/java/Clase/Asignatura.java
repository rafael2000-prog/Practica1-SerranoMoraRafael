package Clase;

public class Asignatura {
	
	private String nombre;
	private String codigo;
	
	//Implementacion de constructor
	public Asignatura() {
		
	}
	
	//Implementacion de Getter y Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	//Implementacion de toString
	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", codigo=" + codigo + "]";
	}
	
	

}
