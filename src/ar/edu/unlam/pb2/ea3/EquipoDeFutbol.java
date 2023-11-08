package ar.edu.unlam.pb2.ea3;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class EquipoDeFutbol {

	private String nombreEquipo;
	private TreeSet<Jugador> equipo;

	public EquipoDeFutbol(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
		equipo = new TreeSet<Jugador>();
	}

	/*
	 * La capacidad m�xima de un equipo es 23. Cualquier intento de agregar m�s
	 * jugadores generar� una excepci�n (CapacidadMaximaException). Adem�s, no
	 * deber� permitir duplicar Jugadores (JugadorDuplicadoException).
	 */
	
	public void agregarJugador(Jugador jugador) throws CapacidadMaximaException, JugadorDuplicadoException {

		if(jugador != null) {
			equipo.add(jugador);
		}else if(equipo.size() >= 23){
			throw new CapacidadMaximaException();
		}else {
			throw new JugadorDuplicadoException();
		}
	}

	/*
	 * Permite cambiar cualquier jugador. Un intento de cambiar un jugador no
	 * presente en el equipo generar� una excepci�n
	 * (JugadoreInexistenteException).
	 */
	public Boolean cambiarJugador(Jugador saliente, Jugador entrante) throws JugadoreInexistenteException{
		
		return false;
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorNombreDeJugador() {
		
		return null;
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorPrecioDeCompraDeJugador() {
		return null;
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorNumeroDeCamisetaDeJugador() {
		return null;
	}

	public TreeSet<Jugador> getJugadores() {
        return equipo;
    }



	
}
	
	
		


	
	
