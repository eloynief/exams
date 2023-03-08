package examen;

import java.util.Arrays;

public class Maquina {
	
	//nombre de cada golosina
	static String[][] nombresGolosinas = {
			{"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
			{"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
			{"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
			{"Lacasitos", "Crunch", "Milkybar", "KitKat"}
			};
	
	//precio de cada golosina
	static double[][] precio = {
			{1.1, 0.8, 1.5, 0.9},
			{1.8, 1, 1.2, 1},
			{1.8, 1.3, 1.2, 0.8},
			{1.5, 1.1, 1.1, 1.1}
			};
	
	//cantidades de cada tipo de golosina
	static int[][] cantidades=new int [4][4];
	
	static String[] ventas=new String[0];
	
	static int total=0;
	//
	public static void rellenarMatriz(int num) {
		
		//recorremos toda la tabla de nombresgolosinas
		for(int i=0; i<nombresGolosinas.length; i++) {
			for (int j=0; j<nombresGolosinas[i].length; j++) {
				
			//igualamos cada posicion en el valor que escogemos
			cantidades[i][j]=num;
			}
		}
		
	}//final rellenar matriz
	
	//
	public static void mostrarGolosinas() {
		// TODO Auto-generated method stub
		
		int cifrafila=0;
		
		for(int i=0; i<nombresGolosinas.length; i++) {
			for (int j=0; j<nombresGolosinas[i].length; j++) {
				
				//hacemos print del número de la fila
				System.out.print(cifrafila);
				//print del número de la columna
				System.out.print(j+" ");
				System.out.print(nombresGolosinas[i][j] + " ");
				System.out.println(precio[i][j] + " ");
				
			}//final segundo for
			
			System.out.println();
			//incrementamos el valor de la fila
			cifrafila++;
		}//final for
	}//final mostrargolosinas
	
	//
	public static boolean validarPos(int fila,int columna) {
		//creamos el boolean y le damos un valor predeterminado
		boolean pos=false;
		
		//si el valor está dentro del tamaño de los arrays
		if(fila<4&&columna<4) {
			//el valor booleano será verdadero y será válido
			pos=true;
			
		}
		
		//si el valor seleccionado está fuera del tamaño de los arrays
		else {
			//entonces no será válido
			pos=false;
			
		}
		
		//luego enviamos el booleano al static
		return pos;
		
	}//final validarpos
	
	//
	public static boolean hayValorPosicion(int fila,int columna) {
		
		//nos dira que si tiene golosinas de ese tipo
		boolean tieneGolosinas=false;
		
		//si en una posicion hay un valor mayor que 0
		if(cantidades[fila][columna]>0) {
			tieneGolosinas=true;
		}
		
		return tieneGolosinas;
	}
	
	//aumentará el valor de golosinas obtenidas
	public static void aumentarPosicion(int fila,int columna,int cantidad){
		//aumenta la cantidad que se introduce en el
		cantidad++;
		
	}

	//reducirá la cantidad de la golosina seleccionada
	public static void reducirPosicion(int fila,int columna,int cantidad) {
		//disminuye la cantidad que se introduce
		cantidades[fila][columna]=cantidades[fila][columna]-cantidad;
	}
	
	//añade a la tabla el nombre de la golosina
	public static void anyadirVenta(int fila,int columna) {
		//aumenta el valor de la tabla
		ventas=Arrays.copyOf(ventas, ventas.length+1);
		
		//introducimos el nombre de la golosina en el array
		ventas[ventas.length-1]= nombresGolosinas[fila][columna];
		
		//vamos guardando el valor del precio total
		total+=precio[fila][columna];
		
	}
	
	//imprime los nombres de las golosinas y el precio total
	public static void imprimirVentasTotales() {
		
		//el nombre de las golosinas
		System.out.println("La golosina seleccionada es: "+Arrays.toString(ventas));
		
		//el precio total
		System.out.println("El precio total es de: "+total);
		
		
	}
	
	
	
}//final clase
