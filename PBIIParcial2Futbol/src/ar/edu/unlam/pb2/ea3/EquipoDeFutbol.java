package ar.edu.unlam.pb2.ea3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EquipoDeFutbol {

	/*
	 * La capacidad m�xima de un equipo es 23. Cualquier intento de agregar m�s
	 * jugadores generar� una excepci�n (CapacidadMaximaException). Adem�s, no
	 * deber� permitir duplicar Jugadores (JugadorDuplicadoException).
	 */
	
	private Set<Jugador> jugadores;
	private String nombre;
	
	public EquipoDeFutbol(String nombre) {
		this.nombre = nombre;
		this.jugadores = new HashSet<>();
	}

	public void agregarJugador(Jugador jugador) throws CapacidadMaximaException, JugadorDuplicadoException {
		if(jugadores.size() == 23)
			throw new CapacidadMaximaException("Equipo lleno");
		if(jugadores.contains(jugador))
			throw new JugadorDuplicadoException("Jugador duplicado");
		jugadores.add(jugador);
	}

	/*
	 * Permite cambiar cualquier jugador. Un intento de cambiar un jugador no
	 * presente en el equipo generar� una excepci�n
	 * (JugadoreInexistenteException).
	 */
	public Boolean cambiarJugador(Jugador saliente, Jugador entrante) throws JugadoreInexistenteException{
		if(!jugadores.contains(saliente))
			throw new JugadoreInexistenteException("Jugador inexistente");
		jugadores.remove(saliente);
		return jugadores.add(entrante);
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorNombreDeJugador() {
		TreeSet<Jugador> PlanteOrdenadoPorNombreDeJugador = new TreeSet<>(new ordenarPorNombre());
		PlanteOrdenadoPorNombreDeJugador.addAll(jugadores);
		return PlanteOrdenadoPorNombreDeJugador;
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorPrecioDeCompraDeJugador() {
		TreeSet<Jugador> PlanteOrdenadoPorNombreDeJugador = new TreeSet<>(new ordenarPorPrecioDeCompra());
		PlanteOrdenadoPorNombreDeJugador.addAll(jugadores);
		return PlanteOrdenadoPorNombreDeJugador;
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorNumeroDeCamisetaDeJugador() {
		TreeSet<Jugador> PlanteOrdenadoPorNombreDeJugador = new TreeSet<>(new ordenarPorNumeroCamiseta());
		PlanteOrdenadoPorNombreDeJugador.addAll(jugadores);
		return PlanteOrdenadoPorNombreDeJugador;
	}

	public Set<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(Set<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
