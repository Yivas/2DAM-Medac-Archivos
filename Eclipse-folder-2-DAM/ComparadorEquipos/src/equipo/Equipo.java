package equipo;

import java.io.Serializable;
import java.util.List;

public class Equipo implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7858828855044928487L;
	String nombre;
    List<Jugador> roster;
    
    // Constructor

    public Equipo() {
        this.nombre = null;
        this.roster = null;
    }

    public Equipo(String nombre, List<Jugador> roster) {
        this.nombre = nombre;
        this.roster = roster;
    }

    // Metodos

    // Este método calculará la puntuación del equipo en base al rango de cada jugador, haciendo la
    // media

    public Double calcularPuntuacion() {
        Double puntuacion = 0.0;
        for (Jugador jugador : roster) {
            puntuacion += jugador.getRango();
        }
        return puntuacion / roster.size();
    }
    
    // Get y Set
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Jugador> getRoster() {
		return roster;
	}
	public void setRoster(List<Jugador> roster) {
		this.roster = roster;
	}


}
