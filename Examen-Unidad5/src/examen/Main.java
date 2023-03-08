package examen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion=0,fila=0,columna=0,num=0;
		String codigo=null;
		boolean verificacion=false,valorposicion=false;
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Hola, bienvenido a la maquina de golosinas");
		
		//mientras que la opción no sea 4
		while(opcion!=4) {
			
			//mensaje principal de la máquina
			System.out.println("SELECCIONE UNA OPCIÓN: ");
			System.out.println("1: MOSTRAR LAS GOLOSINAS DISPONIBLES");
			System.out.println("2: PEDIR LA GOLOSINA QUE QUIERAS SELECCIONAR");
			System.out.println("3: RELLENAR GOLOSINAS");
			System.out.println("4: APAGAR LA MÁQUINA");
			opcion=sc.nextInt();
			
			//muestra las golosinas
			if(opcion==1) {
				Maquina.mostrarGolosinas();
			}//final opcion1
			
			
			//si es la segunda opción
			else if(opcion==2) {
				System.out.println("Introduce el valor de la fila que quieras seleccionar: ");
				fila=sc.nextInt();
				System.out.println("Ahora selecciona el valor de la columna que quieras: ");
				columna=sc.nextInt();
				//valida para ver si la posicion es válida
				verificacion=Maquina.validarPos(fila,columna);
				valorposicion=Maquina.hayValorPosicion(fila, columna);
				//si hay golosinas
				if(verificacion==true) {
					
					//nos dirá que hay golosinas
					System.out.println("Quedan existencias de la golosina");
					
					//si hay golosinas de ese tipo
					if(valorposicion==true) {
						//hay golosinas de ese tipo
						System.out.println("Tenemos golosinas de ese tipo");
						Maquina.reducirPosicion(fila,columna,num);
						
					}
					
					//si no hay más golosinas
					else if (valorposicion==false) {
						//si el valor es 0 entonces nos dira que no hay
						System.out.println("Lo siento, pero no quedan más golosinas de este tipo");
					}//final else hayvalorposicion
					
					
				}//final del if validarpos
				
				//si no hay golosinas
				else if (Maquina.validarPos(fila, columna)==false){
					System.out.println("Has introducido una posición no válida");
				}
				
				
				
				//devolvemos el boolean
				
			}//final opcion2
			
			else if(opcion==3) {
				System.out.println("Introduce el código: ");
				codigo=sc.next();
				if(codigo!="Maquina2023") {
					System.out.println("Introduce la cantidad de golosinas que quieras añadir:");
					num=sc.nextInt();
					Maquina.rellenarMatriz(num);
				}
				
				else {
					System.out.println("Contraseña incorrecta");
				}
			}//final opcion3
			
			//como no hay más de 4 opciones, si eliges una opcion por encima de 4
			else if(opcion>4) {
				//te dirá que la opción no es válida
				System.out.println("Lo siento, pero has introducido una opcion no válida");
				System.out.println();
			}//final opcion4
			
			System.out.println("El precio total es de: " );
			Maquina.imprimirVentasTotales();
		}//fin while
		
	}//fin main

}
