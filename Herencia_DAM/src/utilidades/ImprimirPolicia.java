package utilidades;

import ciudadanos.Ciudadanos;
import empleados.Policias;
import persona.Persona;

public abstract class ImprimirPolicia {
	
	//estoy aqui 
	Persona persona;
	Ciudadanos ciudadano;
	Policias policia;
	
	public static void imprimirDatosPolicia(Persona persona,Ciudadanos ciudadano,Policias poli) {
		
		imprimirDatosPersonales(persona);// multiple funcionalidad
		imprimirDatosFiscales(ciudadano);
		imprimirDatosLaborales(poli);
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
	
	public static void imprimirDatosLaborales(Policias poli) {
		
		System.out.println("Antiguedad..:"+poli.getAntiguedad());
		System.out.println("Numero Placa..:"+poli.getnPlaca());
		
		}
}


