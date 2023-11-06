package ar.edu.unlam.pb2.ea3;

import java.util.Comparator;

public class ordenarPorPrecioDeCompra implements Comparator<Jugador> {

	@Override
	public int compare(Jugador o1, Jugador o2) {
		int valor = 0;
		if (o1.getPrecio() < o2.getPrecio())
			valor = -1;

		if (o1.getPrecio() > o2.getPrecio())
			valor = 1;
		if (o1.getPrecio() == o2.getPrecio())
			valor = 0;
		return valor;

	}

}
