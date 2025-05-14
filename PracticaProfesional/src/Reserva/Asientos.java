package Reserva;

import java.util.Scanner;

public class Asientos {

	//10 filas con 10 asientos
	public static void main(String[] args) {
		char asientos [][] = new char [10][10];
		boolean bandera = false;
		//Scanner es para que por pantalla se pueda ingresar datos
		Scanner teclado = new Scanner(System.in);
		int fila, asiento;
		String respuesta; 
		
		for(int f=0; f<10; f++) {
			for(int c=0; c<10; c++) {
				asientos[f][c]= 'L';
			}
		}
		System.out.println("--------Sistema de Reservas--------");
		while(bandera!=true) {
			System.out.println("Ingreser Fila y Asiento a reservar");
			System.out.print("Fila (entre 0 y 9)");
			fila = teclado.nextInt();
			
			System.out.print("Asiento (entre 0 y 9)");
			asiento = teclado.nextInt();
			
			if(asientos[fila][asiento]=='L') {
				asientos[fila][asiento] = 'X';
				System.out.print("El asiento se reservo correctamente.");
			} else {
				System.out.print("El asiento se encuentra ocupado. Por favor, Elija otro");
			}
			
			System.out.print("¿Desea finalizar con la reserva?");
			System.out.print("S: si; Cualquier letra: no.");
			respuesta = teclado.next(); // guardo la respuesta
			///////////
			if(respuesta.equalsIgnoreCase("S")) { 
			// como es string se usa equals, uso el ignorar el mayucula o minuscula
				bandera=true;
			}
		}
	}
}
