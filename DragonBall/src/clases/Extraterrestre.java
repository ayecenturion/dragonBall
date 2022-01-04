package clases;

public abstract class Extraterrestre extends Personaje{

	private int cantAliados;
	public Extraterrestre(String nombre, int ki, int cantAliados) {
		super(nombre, ki);
		setCantAliados(cantAliados);
	}
	
	public int getCantAliados() {
		return cantAliados;
	}

	public void setCantAliados(int cantAliados) {
		this.cantAliados = cantAliados;
	}

	public abstract void comerSemilla();
	
}
