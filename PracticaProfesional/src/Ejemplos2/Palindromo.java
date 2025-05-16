package Ejemplos2;

import java.util.Scanner;

public class Palindromo {

	// dejamos adentro 
	public static boolean Palindromo(String Palabra) {
		
		for(int i=0; i< Palabra.length(); i++) {
			if(Palabra.charAt(i) != Palabra.charAt(Palabra.length() - i -1)) {
				// java agrega al final de la palabra un"/0", lo omitimos con el -1
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String Palabra;
		
		Scanner Teclado = new Scanner(System.in);
		System.out.print("Ingrese la palabra: ");
		Palabra= Teclado.next();
		
		if(Palindromo(Palabra)==true) {
			System.out.printf("La frase \"%s\" SI es un palindromo%n", Palabra);
			// \"%s\" es donde estará el string 
			// %n es un tabulador
		} else {
			System.out.printf("La frase \"%s\" NO es un palindromo%n", Palabra);
		}
	}
}