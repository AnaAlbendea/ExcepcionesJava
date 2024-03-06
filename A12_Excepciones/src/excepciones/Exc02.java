package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exc02 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int valor;
		boolean incorrecto;
		
		do {
			System.out.print("Ingrese un valor numerico: ");
			incorrecto = false;
			try {
				valor = tec.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("Insulto...");
				incorrecto = true;
				valor = 0;
				tec.nextLine();
			}
		} while(incorrecto);
		
		System.out.println(valor);
	}
}
