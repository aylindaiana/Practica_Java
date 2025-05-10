package Ejemplos1;

public class ContarVocal {
	
    public static int contarVocales(String texto) {
        int contador = 0;
        texto = texto.toLowerCase(); 

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }

        return contador;
    }
    // otra forma
    public static int contarVo(String text) {
    	long count = text.toLowerCase() // paso todo a minuscula
    					.chars() // convierte al string a enteros
    					.filter(c -> "aeiou".indexOf(c) != -1) 
    					.count();
		return (int) count;
    }

    public static void main(String[] args) {
        String ejemplo = "Hola Mundo!";
        int cantidad = contarVocales(ejemplo);
        System.out.println("Cantidad de vocales: " + cantidad);
    }
}
