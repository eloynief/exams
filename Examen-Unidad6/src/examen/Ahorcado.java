package examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {
	//las palabras que te aparecen en el juego
	public static String[] palabras= { "humanidad","persona","hombre","mujer","individuo","cuerpo","pierna","cabeza","brazo","familia"};
	
	//el número de intentos
	public static int NUMINTENTOS=7;
	
	//almacena un valor random del array
	public static String palabraSecreta;
	
	//guarda "_" según la length de palabraSecreta
	public static String palabraPista;
	//almacena las letras que no son iguales a ninguna de las letras de la palabra secreta
	public static String noAcertadas;
	
	public static void generaPalabra() {
		palabraSecreta=palabras[(int) (Math.random()*10)];
		//almacena los valores de la palabra
	}//final genera palabra
	
	
	//
	static int menu(){
		
		Scanner sc= new Scanner(System.in);
		
		//la opcion para seleccionar
		int opcion=0;
		
		System.out.println("Seleccione una de las siguientes opciones:");
		System.out.println("1. Introducir letra.");
		System.out.println("2. Introducir palabra.");
		
		//introduces la opcion
		opcion=sc.nextInt();
		
		//devuelve la opcion
		return opcion;
	}
	
	//comprueba si la palabra tiene la letra que pusistes
	public static void compruebaLetra(String recibir) {
		
		String falloletras = null;
		
		//generar las _ de palabrapista
		for(int numletras=0;numletras<palabraSecreta.length();numletras++) {
			//se generan segun el numero de letras que tiene la palabra secreta
			palabraPista.equals(palabraPista+"_");
		}
		
		//se almacenan los guiones en un array
		char[] guiones= palabraPista.toCharArray();
		
		//
		char[] letras = palabraSecreta.toCharArray();
		//
		String letra = null;
		String guion = null;
//		palabraSecreta.toCharArray()
		
		//mira por cada letra que tiene la palabra
		for(int i=palabraSecreta.length();i>0;i--) {//se usa en comprueba letra
			//mira las veces
				
				letra.equals(letras[i]);
				guion.equals(guiones[i]);
				
				//si el valor de recibir es el mismo que el de letras en cierta posicion, se sustituye los "_" por la letra
				if(letra.equals(recibir)) {

					//si en esa posicion del array esta esa palabra, entonces se iguala
					//se sustituye el valor por el otro
					guion.equals(letras[i]);
					/*
					 * se sustituye el _ por la letra
					 */
					guiones[i]=letra;
					
				}//final if
				
				else {
					//
					noAcertadas.equals(recibir);
					falloletras.equals(noAcertadas+falloletras);
				}//final else

				
		}
		
	}
	
	
	public static void compruebaPalabra(String recibir) {
		
		
		
	}
	
	public static void pintaPista() {

//		String falloletras=compruebaletra(noAcertadas)+falloletras;
		System.out.println("Las letras que no has acertado: "+);
		
	}


}
