package common;


import java.io.Serializable;

public class Persona implements Serializable{

	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		
		setNombre(nombre);
		setEdad(edad);
		
		
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	private void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	
	
	
}
