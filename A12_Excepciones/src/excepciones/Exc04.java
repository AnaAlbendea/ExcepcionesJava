package excepciones;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exc04 {
	public static void main(String[]args) {
		try {
			open();
			read();
			close();
			return;//independientemente que haya un return el finally se ejercuta porque esta dentro de catch 
		}catch(IOException e) {
			System.out.println("Aviso al usuario");
		}finally {  //puede ir dentras de un try o try catch finally nunca solo
			System.out.println("Esto se ejecuta siempre");
		}
		
	}
	static void open()throws FileNotFoundException{
		//throw new FileNotFoundException();
		
	}
	static void read()throws IOException{
		
	}
	static void close()throws FileNotFoundException{
		
	}

}
