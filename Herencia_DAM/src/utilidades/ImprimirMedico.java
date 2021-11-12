package utilidades;

import ciudadanos.Ciudadanos;
import empleados.Medicos;
import persona.Persona;


public abstract class ImprimirMedico {
	
	Persona persona;
	Ciudadanos ciudadano;
	Medicos medicos;
	
public static void imprimirDatosMedico(Persona persona,Ciudadanos ciudadano,Medicos medico) {
		
		imprimirDatosPersonales(persona);// multiple funcionalidad
		imprimirDatosFiscales(ciudadano);
		imprimirDatosLaborales(medico);
	}
	
	public static void imprimirDatosPersonales(Persona persona) {
		
		System.out.println("Nombre..:"+persona.getNombre());
		System.out.println("Edad..:"+persona.getEdad());
		System.out.println("Peso..:"+persona.getPeso());
		
		
	}
	
	public static void imprimirDatosFiscales(Ciudadanos ciudadano) {
		
		System.out.println("DNI.:"+ciudadano.getDni());
		System.out.println("SS..:"+ciudadano.getnSS());
		System.out.println("Domicilio..:"+ ciudadano.getDomicilio());
		
		
	}
	
	public static void imprimirDatosLaborales(Medicos medico) {
		
		System.out.println("Especialidad..:"+medico.getEspecialidad());
		System.out.println("Nº Colegiado..:"+medico.getNcolegiado());
		
		
		
	}

}
