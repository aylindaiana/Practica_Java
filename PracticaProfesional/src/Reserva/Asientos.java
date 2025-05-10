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
		
		for(int f=0; f<10; f++) {
			for(int c=0; c<10; c++) {
				asientos[f][c]= 'L';
			}
		}
		while(bandera!=true) {
			System.out.println("Ingreser Fila y Asiento a reservar");
			System.out.print("Fila (entre 0 y 9)");
			fila = teclado.nextInt();
	}
}
