package clases;

public abstract class Personaje {
	private String planetaOrigen;
	private String nombre;
	private int ki;
	
	
	public Personaje(String nombre, int ki) {
		setNombre(nombre);
		setKi(ki);
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getKi() {
		return ki;
	}

	public void setKi(int ki) {
		this.ki = ki;
	}


	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", ki=" + ki + "]";
	}
	
	public abstract void comerSemilla();
	
	
	
}
