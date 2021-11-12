package ciudadanos;

import persona.Persona;

public class Ciudadanos extends Persona {
	
	
	private int dni;
	private int nSS;
	private String domicilio;
	
	public Ciudadanos() {}
	
	/**Constructor con Parametros
	 * @param dni
	 * @param nSS
	 * @param domicilio
	 */
	
	public Ciudadanos(int dni, int nSS, String domicilio) {
		this.dni = dni;
		this.nSS = nSS;
		this.domicilio = domicilio;
	}
	//-----------------------------------------------
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getnSS() {
		return nSS;
	}
	public void setnSS(int nSS) {
		this.nSS = nSS;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	

}
