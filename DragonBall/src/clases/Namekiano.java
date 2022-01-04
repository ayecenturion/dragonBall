package clases;

public class Namekiano extends Extraterrestre{

	private static int INCREMENTO_KI = 100;
	private static int KI_EXTRA = 10;
	private static int MAS_500 = 500;
	
	public Namekiano(String nombre, int ki, int cantAliados) {
		super(nombre, ki,cantAliados);
		
	}


	public void comerSemilla() {
		int kiActual = getKi() + INCREMENTO_KI;
		if(kiActual >= MAS_500) {
			kiActual += getCantAliados() * 10;
		}
		setKi(kiActual);
	}
}
