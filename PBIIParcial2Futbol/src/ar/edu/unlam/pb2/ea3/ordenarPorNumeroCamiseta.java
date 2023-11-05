package ar.edu.unlam.pb2.ea3;

import java.util.Comparator;

public class ordenarPorNumeroCamiseta implements Comparator<Jugador> {

	@Override
	public int compare(Jugador o1, Jugador o2) {
		int valor = 0;
		if(o1.getNumero()<o2.getNumero())
			valor= -1;
		
		if(o1.getNumero()>o2.getNumero())
			valor= 1;
		if(o1.getNumero()==o2.getNumero())
			valor= 0;
		return valor;
	}

}
