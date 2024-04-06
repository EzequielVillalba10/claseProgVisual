package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {
	
	public static void main(String [] args){
		// EJEMPLO WHILE
		/*
		int numero = 1;
		//System.out.println(numero);
		
		while (numero<=10)
		{
			System.out.println(numero);
			numero++;
		}
		System.out.println("Fin del programa");
		
		
		//EJEMPLO DE DO WHILE
		numero = 1 ;
		do {
			System.out.println(numero);
			numero++;
		}while(numero<=10);
		
		*/
		// NOS PIDEN QUE PARA EL ALUMNO ARIEL VEGA SE REGISTRE LAS NOTAS FINALES DE 4 MATEIRAS.
		
		
		
		Alumno alumno = generarAlumno();
		
		registrarNotas(alumno, 2);
		
		
	}
	
	
	
	public static Alumno generarAlumno() {
		
		Alumno alumno = new Alumno();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el legajo: ");
		Integer legajo = scanner.nextInt(); // tranforma lo que entra por consola en un entero Int
		System.out.println(legajo);
		
		System.out.println("Ingrese el apellido: ");
		String apellido = scanner.next();
		System.out.println("Ingrese el nombre: ");
		String nombre = scanner.next();
		
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		//scanner.close();
		return alumno;
	}
	
	public static void registrarNotas(Alumno alumno, int numMaterias) {
	

		Scanner scanner = new Scanner(System.in);
		while (numMaterias <= 2)
		{
		
			// Cargar Materia
			System.out.println("Ingrese el codigo de la materia: ");
			String codigoMateria = scanner.next();
			
			System.out.println("Ingrese el nombre de la materia: ");
			String nombreMateria = scanner.next();
			
			Materia materia = new Materia(codigoMateria, nombreMateria)	;
			
			System.out.println("Ingrese el codigo del registro: ");
			String codigoNota = scanner.next();
			
			System.out.println("Ingrese la nota final: ");
			float nota = scanner.nextFloat();
			
			RegistroNota registroNota = new RegistroNota(codigoNota, alumno, materia, nota);
			
			System.out.println(registroNota.toString());
			
			numMaterias++;
		}
		//scanner.close();
	}
}
