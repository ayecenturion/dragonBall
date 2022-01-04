package clases;

public class Terricola extends Personaje{

	private static int INCREMENTO_KI = 200;
	
	public Terricola(String nombre, int ki) {
		super(nombre, ki);
	}
	
	public void comerSemilla() {
		
		setKi(getKi() + INCREMENTO_KI);
	}
	
}
