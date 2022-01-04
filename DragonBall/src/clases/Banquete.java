package clases;

import implementaciones.ColaNodos;

public class Banquete {
	private ColaNodos<Personaje> colaDePersonajes;
	ListaMejoresPersonajes listaMejores;
	ListaMasDebiles listaDebiles;
	private static int TOPE_MEJORES = 5;
	
	public Banquete() {
		colaDePersonajes = new ColaNodos<Personaje>();
		listaMejores = new ListaMejoresPersonajes();
		listaDebiles = new ListaMasDebiles();
	}
	
	public void procesarLlegada(Personaje p) {
		if(p == null) {
			throw new IllegalArgumentException("El personaje no existe");
		}
		this.colaDePersonajes.add(p);
	}
	
	public void desarrollarBanquete() {
		Personaje centinela = new Terricola("@@",0);
		Personaje pActual;
		
		this.colaDePersonajes.add(centinela);
		pActual = this.colaDePersonajes.remove();
		
		while(pActual != centinela) {
			pActual.comerSemilla();
			this.listaMejores.add(pActual);
			this.listaDebiles.add(pActual);
			this.colaDePersonajes.add(pActual);
			pActual = this.colaDePersonajes.remove();
		}
	}
	public void mostrarListaMasPoderosos() {
		for (Personaje personaje : listaMejores) {
			System.out.println(personaje);
		}
	}
	public void mostrarListaMasDebiles() {
		for (Personaje personaje : listaDebiles) {
			System.out.println(personaje);
		}
	}
	
	
}
