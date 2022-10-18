package persona;

import java.util.Date;

public class Persona {

	String nombre;
	String Apellidos;
	Date fechaNacimiento;
	
	//Constructor

	public Persona() {
		super();
		this.nombre = null;
		this.Apellidos = null;
		this.fechaNacimiento = null;
	}

	public Persona(String nombre, String apellidos, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		Apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	// Get y Set
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
	
	
}
