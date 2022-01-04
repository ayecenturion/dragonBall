package clases;

public class Demonio extends Personaje{
	private static int INCREMENTO_KI = 200;
	private static int KI_EXTRA = 10;
	private int cantVictimas;
	
	

	public Demonio(String nombre, int ki, int cantVictimas) {
		super(nombre,ki);
		setCantVictimas(cantVictimas);
	}
	
	public int getCantVictimas() {
		return cantVictimas;
	}

	public void setCantVictimas(int cantVictimas) {
		this.cantVictimas = cantVictimas;
	}

	public void comerSemilla() {
		int kiActual = getKi() + INCREMENTO_KI;
			kiActual += cantVictimas * 10;
		setKi(kiActual);
	}
}
