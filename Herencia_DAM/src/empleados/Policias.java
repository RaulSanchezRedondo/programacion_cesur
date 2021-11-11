package empleados;

import ciudadanos.Ciudadanos;



public class Policias extends Ciudadanos {
	//Policia extiende de ciudadanos
	
	private int antiguedad;
	private int nPlaca;

	public Policias() {}
	

	//Aqui heredamos del superconstructor de Ciudadanos.
	public Policias(int dni, int nSS, String domicilio,int antiguedad,int nPlaca) {
		super(dni, nSS, domicilio); //herencia del superconstructor de Ciudadanos
		this.antiguedad = antiguedad;
		this.nPlaca = nPlaca;
		
	}

	//********************************
	public int getAntiguedad() {
		return antiguedad;
	}
	
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public int getnPlaca() {
		return nPlaca;
	}
	public void setnPlaca(int nPlaca) {
		this.nPlaca = nPlaca;
	} 
	
	

}
