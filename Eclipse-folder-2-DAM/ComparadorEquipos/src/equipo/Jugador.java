package equipo;

import java.io.Serializable;

import persona.Persona;

public class Jugador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -12723481892680071L;
	Persona persona;
	Posicion posicion;
	Lista lista;
	Integer rango; //1 a 10
	
	//Constructor

	public Jugador() {
		super();
		this.persona = null;
		this.posicion = null;
		this.lista = null;
		this.rango = null;
	}

	public Jugador(Persona persona, Posicion posicion, Lista lista, Integer rango) {
		super();
		this.persona = persona;
		this.posicion = posicion;
		this.lista = lista;
		this.rango = rango;
	}


	//Get y Set
	
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	public Lista getLista() {
		return lista;
	}
	public void setLista(Lista lista) {
		this.lista = lista;
	}
	public Integer getRango() {
		return rango;
	}
	public void setRango(Integer rango) {
		this.rango = rango;
	}

	
	
	
}
