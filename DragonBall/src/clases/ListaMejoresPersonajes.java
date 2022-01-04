package clases;

import implementaciones.ListaOrdenadaNodos;

public class ListaMejoresPersonajes extends ListaOrdenadaNodos<Integer,Personaje>{

  
	@Override
	public int compare(Personaje p1, Personaje p2) {
		return p2.getKi() - p1.getKi();
	}

	@Override
	public int compareByKey(Integer clave, Personaje p) {
		return clave - p.getKi();
	}

}
