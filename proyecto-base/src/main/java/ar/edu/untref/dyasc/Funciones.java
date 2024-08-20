package ar.edu.untref.dyasc;

public class Funciones {

	//Pre: Recibe un numero entero mayor o igual a 0
	//Pos: Dado el numero n, retorna la n-esima posicion de la Serie de Fibonacci, considerando 0 como posicion inicial 
	public static int fibonacciEnPosicionN(int n) {
		if (n == 0) {
			return 0;
	    } else if (n == 1) {
		    return 1;
		} else {
		    return fibonacciEnPosicionN(n - 1) + fibonacciEnPosicionN(n - 2);
		}
	}
	//Pre: Recibe un numero entero mayor o igual a 1
	//Pos: Retorna una cadena de caracteres con los numeros de la Serie de Fibonacci con n cantidad de numeros
	public static String serieFibonacci(int n) {
		StringBuilder resultado = new StringBuilder();
		for (int i = 0; i < n-1; i++) {
			resultado.append(fibonacciEnPosicionN(i));
			resultado.append(" ");
		}
			resultado.append(fibonacciEnPosicionN(n-1));
			return resultado.toString();
		}
}
