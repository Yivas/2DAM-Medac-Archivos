package baseballVS;

import java.util.ArrayList;
import java.util.Date;
import equipo.Equipo;
import equipo.Jugador;
import equipo.Lista;
import equipo.Posicion;
import persona.Persona;

public class Main {

	@SuppressWarnings("deprecation")
    public static void main(String[] args) {
		// Haciendo uso de las clases creadas, se creará una lista de jugadores on la clase Jugador,
		// a partir de la cual se calculará
		// la puntuación media del equipo.
		// Se tiene que imprimir por consola el valor de la puntuación media.
		
		// Creamos las personas necesarias para los jugadores
		Persona p1 = new Persona("Juan", "Perez", new Date(1990, 10, 10));
		Persona p2 = new Persona("Maria", "Gomez", new Date(1991, 11, 11));
		Persona p3 = new Persona("Pedro", "Garcia", new Date(1992, 12, 12));
		Persona p4 = new Persona("Luis", "Lopez", new Date(1993, 1, 1));
		Persona p5 = new Persona("Ana", "Martinez", new Date(1994, 2, 2));


		// Creación de los jugadores
		Jugador j1 = new Jugador(p1, Posicion.Pitcher, Lista.activo, 10);
		Jugador j2 = new Jugador(p2, Posicion.Catcher, Lista.activo, 9);
		Jugador j3 = new Jugador(p3, Posicion.Infielder, Lista.activo, 8);
		Jugador j4 = new Jugador(p4, Posicion.Pitcher, Lista.banquillo, 7);
		Jugador j5 = new Jugador(p5, Posicion.Catcher, Lista.banquillo, 6);
		
		// Creacion lista de la jugadores
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		jugadores.add(j1);
		jugadores.add(j2);
		jugadores.add(j3);
		jugadores.add(j4);
		jugadores.add(j5);


		// Creacion del equipo
		Equipo e1 = new Equipo("Los Angeles Dodgers", jugadores);

		// Calculo de la puntuacion media del equipo
		System.out.println("La puntuacion media del equipo es: " + e1.calcularPuntuacion());

		

	}

}
