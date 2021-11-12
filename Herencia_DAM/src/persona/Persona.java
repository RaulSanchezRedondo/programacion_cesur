package persona;

public class Persona {

	// esta es la superclase

	private int edad;
	private int peso;
	private String nombre;

	public Persona() {
	};// constructor

	/**
	 * Constructor de la superclase
	 * 
	 * @param edad
	 * @param peso
	 * @param nombre
	 */
	public Persona(int edad, int peso, String nombre) {
		this.edad = edad;
		this.peso = peso;
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
