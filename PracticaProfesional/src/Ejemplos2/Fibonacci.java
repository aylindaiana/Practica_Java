package Ejemplos2;

public class Fibonacci{

	public static int Finobacci(int numero) {
		
		int rec1 = 0;
		int rec2 = 1;
		
        for (int i = 2; i <= numero; i++) {
            int resultado = rec1 + rec2;
            rec1 = rec2;
            rec2 = resultado;
        }
		return numero;
		
	}
}
