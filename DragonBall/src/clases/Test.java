package clases;

public class Test {

	public static void main(String[] args) {
		Banquete b = new Banquete();
		
		//CREO A LOS PERSONAJES
		Personaje t1 = null;
		Personaje t2 = new Terricola("Juan",150);
		Personaje t3 = new Terricola("Juana",100);
		Personaje d1 = new Demonio("Julian",200,5);
		Personaje d2 = new Demonio("Juliana",300,7);
		Personaje d3 = new Demonio("Javier",50,2);
		Personaje n1 = new Namekiano("Camila",400,5);
		Personaje n2 = new Namekiano("Fernanda",350,2);
		Personaje n3 = new Namekiano("Fabricio",100,8);
		Personaje s1 = new Saiyajin("Rocio",250,5);
		Personaje s2 = new Saiyajin("Ayelen",500,2);
		
		procesarLlegada(b,t1);
		procesarLlegada(b,t2);
		procesarLlegada(b,t3);
		procesarLlegada(b,d1);
		procesarLlegada(b,d2);
		procesarLlegada(b,d3);
		procesarLlegada(b,n1);
		procesarLlegada(b,n2);
		procesarLlegada(b,n3);
		procesarLlegada(b,s1);
		procesarLlegada(b,s2);
		
		System.out.println("****COMIENZA EL BANQUETE, TODOS COMEN****");
		b.desarrollarBanquete();
		System.out.println("****LISTA MAS PODEROSOS****");
		b.mostrarListaMasPoderosos();
		System.out.println("****LISTA MAS DEBILES****");
		b.mostrarListaMasDebiles();
		
	}
	private static void procesarLlegada(Banquete b, Personaje p) {
		try {
			b.procesarLlegada(p);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
