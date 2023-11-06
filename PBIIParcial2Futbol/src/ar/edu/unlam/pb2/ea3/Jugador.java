package ar.edu.unlam.pb2.ea3;

import java.util.Objects;

public class Jugador {

	private int numero;
	private String nombre;
	private int precio;

	public Jugador(int numero, String nombre, int precio) {
		this.numero = numero;
		this.nombre = nombre;
		this.precio = precio;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Jugador [numero=" + numero + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

}
