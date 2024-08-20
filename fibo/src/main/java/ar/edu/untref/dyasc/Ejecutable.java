package ar.edu.untref.dyasc;

public class Ejecutable {
	
	
    public static void main(String[] args) {
    	if (args.length != 1) {
            System.out.println("Valor de entrada inavlido - Solo se acepta un numero entero positivo");
            return;
        };
        //Se asume que el dato de entrada en correcto
        int n  = Integer.parseInt(args[0]);
        String resultado = Funciones.serieFibonacci(n);
        System.out.println("fibo<" + n + ">: " + resultado);
    }
}
