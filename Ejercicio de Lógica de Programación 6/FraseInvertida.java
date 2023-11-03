
import java.util.Scanner; // Importa la clase Scanner del paquete java.util para recibir entrada del usuario.

public class FraseInvertida {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Crea un objeto Scanner para recibir entrada del usuario.
		System.out.println("Ingrese una palabra o frase: ");
		String palabra = sc.nextLine(); // Lee la entrada del usuario y la almacena en la variable "palabra".
		
		if(palabra == null || palabra == "") { // Comprueba si la entrada es nula o vacía.
			System.out.println("No");
		}else {
			System.out.println("La palabra invertida es: ");
			for(int i = palabra.length()-1; i>=0; i--) { // Recorre la cadena desde el último carácter hasta el primero.
				System.out.print(palabra.charAt(i)); // Imprime cada carácter en orden inverso.
			}
		}
		
		sc.close(); // Cerramos Scanner
	}
}
