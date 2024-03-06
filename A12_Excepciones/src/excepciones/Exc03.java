package excepciones;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Exc03 {

	//sabe como arreglar FileNotFound pero no como arreglar IOE y SQL
	public static void opcion1() throws IOException, SQLException {
		try {
			problematico(1);
		} catch(FileNotFoundException e) {
			System.out.println("Arreglado el FileNotFound");
		}
	}
	
	//Trata y soluciona las 3 excepciones. Con soluciones diferentes
	public static void opcion2() {
		try {
			problematico(55);
		} catch (SQLException e) {
			System.out.println("Arreglar SQL");
		} catch(FileNotFoundException e) {
			System.out.println("Arreglar FileNotFound");
		} catch (IOException e) {
			System.out.println("Arreglar IOE");
		} 
	}
	
	//Trata y soluciona las 3, pero captura fileNotFound con IOE
	public static void opcion3() {
		try {
			problematico(55);
		} catch (SQLException e) {
			System.out.println("Arreglar SQL");
		} catch(IOException e) {
			System.out.println("Arreglar FileNotFound y IOE");
		} 
	}
	
	// Trata y solucina las 3 con la misma solución
	public static void opcion4() {
		try {
			problematico(55);
		} catch (Exception e) {
			System.out.println("Soluciona las 3");
		} 
	}
	
	// Trata y solucina las 3 con la misma solución
	public static void opcion5() {
		try {
			problematico(55);
		} catch (SQLException | IOException e) {
			System.out.println("Soluciona las 3");
		} 
	}
	
	static void problematico(int num) throws FileNotFoundException, IOException, SQLException {
		if (num == 1) {
			throw new FileNotFoundException();
		} else if(num == 2) {
			throw new IOException();
		} else if(num == 3) {
			throw new SQLException();
		}
		System.out.println("todo fenomenal!!!");
	}
}
