package excepciones;

public class Exc01 {

	public static void main(String[] args) {
		otroMetodo(11);
		System.out.println("Fin de la aplicacion");
	}
	
	static void otroMetodo(int indice) throws IllegalArgumentException {
		System.out.println("ejecuta linea 1");
		
		try {
			imprime(indice);
			System.out.println("imprime se ejecuto correctamente");
		} catch (ArrayIndexOutOfBoundsException e) {
			// Aqui va el codigo que arregla el problema de IndexOut...
			System.out.println(e.getMessage());
			e.printStackTrace();
			
			throw new IllegalArgumentException("El valor " + indice + " es incorrecto");
			
		}
		System.out.println("ejecuta linea 3");
	}
	
	
	static void imprime(int indice) throws IndexOutOfBoundsException {
		String[] datos = {"uno", "dos", "tres"};
		System.out.println(datos[indice]);
	}
}
