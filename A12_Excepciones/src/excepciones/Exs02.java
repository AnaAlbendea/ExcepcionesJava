package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exs02 {

	public static void main(String []args) {
		Scanner tec=new Scanner(System.in);
		int valor;
		boolean incorrecto;
		System.out.println("Ingrese valor númerico");
		incorrecto=false;
		
		do {
			try {
			valor=tec.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("Ingrese el valor correcto");
				incorrecto=true;
				valor=0;
				tec.nextLine();
			}
		
		} while(incorrecto);
		
		System.out.println(valor);
		
	}
}
