package clases;

import implementaciones.ListaOrdenadaNodos;

public class ListaMasDebiles extends ListaOrdenadaNodos<Integer,Personaje> {

	@Override
	public int compare(Personaje p1, Personaje p2) {
		return p1.getKi() - p2.getKi();
	}

	@Override
	public int compareByKey(Integer clave, Personaje p) {
		return clave - p.getKi();
	}

}
