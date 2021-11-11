package empleados;

import ciudadanos.Ciudadanos;

public class Medicos extends Ciudadanos {
	
	private int Ncolegiado;
	private String especialidad; 
	
	
	public Medicos() {}
	
	

    //Constructor que hereda de la SUPERCLASE Cuidadanos
	public Medicos(int dni, int nSS, String domicilio,int Ncolegiado,String especialidad) {
		super(dni, nSS, domicilio);
		this.Ncolegiado = Ncolegiado;
		this.especialidad = especialidad;
	}


	public int getNcolegiado() {
		return Ncolegiado;
	}


	public void setNcolegiado(int ncolegiado) {
		Ncolegiado = ncolegiado;
	}


	public String getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	
	

}
