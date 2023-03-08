package examen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String palabra;
		String letra;
		int seleccion;
		
		while(Ahorcado.NUMINTENTOS>0) {
		//te muestra en pantalla en menu
		seleccion=Ahorcado.menu();
		
		
		
			if(seleccion==1) {
				//pide que escribamos una palabra
				System.out.println("Escribe una palabra: ");
				
				
				//introducir la palabra
				palabra=sc.next();
				
				Ahorcado.compruebaLetra(palabra);
				
				
			}
			else if(seleccion==2) {
				//nos dice que escribamos una letra
				System.out.println("Escribe una letra: ");
				
				//introducimos la letra
				letra=sc.next();
				
				Ahorcado.compruebaLetra(letra);
				
				//si la letra no esta en la palabra
				if() {
					//se reduce el numero de intentos si fallas
					Ahorcado.NUMINTENTOS--;
				}
				
			}
			
		System.out.println(Ahorcado.palabraPista);
		
//		//se reduce el numero de intentos si fallas
//		Ahorcado.NUMINTENTOS--;
		
		}
		
	}

}
