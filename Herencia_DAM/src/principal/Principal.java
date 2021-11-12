package principal;

import java.util.ArrayList;

import ciudadanos.Ciudadanos;
import empleados.Medicos;
import empleados.Policias;
import persona.Persona;
import utilidades.ImprimirMedico;
import utilidades.ImprimirPolicia;

public class Principal {

	public static void main(String[] args) {

		Persona persona1 = new Persona();//llamada al constructor vacio
		persona1.setNombre("Persona1 con Constructor_Vacio");
		persona1.setEdad(40);
		persona1.setPeso(70);
		// --------------------------------
		Persona persona2 = new Persona(45, 75, "Persona2 con Constructor con paramentros");
		Persona persona3 = new Persona(46, 73, "Persona3 con Constructor con paramentros");
		System.out.println("------------FIN CREACION OB.PERSONAS-------------------------");

		// ----------------------------LISTAS Y METODOS-------------------------------------
		// ---------------------------------------------------------------------------------

		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		listaPersonas.add(persona1); //posicion 0
		listaPersonas.add(persona2); //posicion 1
		listaPersonas.add(persona3);// posicion 2
		//boolean contiene = listaPersonas.contains(persona2);

		for (Persona persona : listaPersonas) {

			//System.out.println("Valor de contiene.." + listaPersonas.contains(persona2) );
			System.out.println("El nombre es..." + persona.getNombre());
			System.out.println("La edad es..." + persona.getEdad());
			
			}
		
		System.out.println("------------FIN FOR EACH-------------------------");

		// -------------------------------------------------------------------------

		Persona pers1 = listaPersonas.get(1);// get() devuelve la posición de un objeto
		System.out.println("Posicion devuelta por el metodo get().."+pers1.getNombre());
		System.out.println("----------------FIN METODO GET() ARRAYLIST---------------------");

		// ----------------------------------------------------------------------------
		System.out.println("----------------BORRADO DE OBJETOS---------------------");

		listaPersonas.remove(0); // borrando el objeto en posición 0

		for (Persona persona : listaPersonas) {

			System.out.println("El nombre es..." + persona.getNombre());

		}
		System.out.println("----------------FIN BORRADO DE OBJETOS-----------------------");
		
		//**************************************************************************************
		
		System.out.println("----------------CLONADO DE LISTAS---------------------------");
		
		@SuppressWarnings("unchecked")
		ArrayList<Persona> listaPersonasClonadas =  (ArrayList<Persona>) listaPersonas.clone();
		
		for (Persona persona : listaPersonasClonadas) {
			
			System.out.println("Dentro de la lista clonada...");
			System.out.println("El nombre es..." + persona.getNombre());
			
		}
		
		System.out.println("----------------FIN CLONADO DE LISTAS---------------------------");
		
		System.out.println("----------------TAMAÑO DE LISTAS---------------------------");
		
		int sizeLista = listaPersonasClonadas.size();
		System.out.println("Tamaño de la lista....."+sizeLista);
		listaPersonasClonadas.add(persona1);
		sizeLista = listaPersonasClonadas.size();
		System.out.println("Tamaño de la lista....."+sizeLista);

	
		
		// ---------------------HERENCIA-----------------------------------------------

		Ciudadanos ciudadano1 = new Ciudadanos();
		//ciudadano1.setNombre("Pepe"); // propiedad heredada de Persona
		//ciudadano1.setEdad(50); // propiedad heredada de Persona
		//ciudadano1.setPeso(75); // propiedad heredada de Persona
		ciudadano1.setDni(123456);
		ciudadano1.setDomicilio("Zaragoza");
		ciudadano1.setnSS(1234567);
		// ********************************************************************

		// *************************POLIMORFISMO*******************************

		Persona personaCiudadano = new Ciudadanos(789456, 7894561, "Zaragoza");
		personaCiudadano.setEdad(0);
		personaCiudadano.setNombre("Alfonso");
		personaCiudadano.setPeso(90);

		// ***************************HERENCIA TOTAL************************************************

		Policias poli1 = new Policias();
		poli1.setNombre("A");
		poli1.setDni(123);
		poli1.setDomicilio("Cesur");
		poli1.setnSS(456);
		poli1.setPeso(90);
		poli1.setEdad(30);
		poli1.setAntiguedad(10); // PROPIEDADES DEL POLICIA
		poli1.setnPlaca(88);
		
		System.out.println("----------------IMPRIMIENDO DATOS POLICIA---------------------------");
		ImprimirPolicia.imprimirDatosPolicia(persona1, ciudadano1, poli1);
		
		System.out.println("----------------IMPRIMIENDO DATOS MEDICO---------------------------");
		Persona personaMedico = new Persona(45, 45, "Jano");
		Ciudadanos ciudadadanoPersona = new Ciudadanos(789, 987, "Huesca");
		Medicos medico = new Medicos();
		medico.setNcolegiado(4561413);
		medico.setEspecialidad("Cirujia");
		ImprimirMedico.imprimirDatosMedico(personaMedico, ciudadadanoPersona, medico);
		
		

	}

}
