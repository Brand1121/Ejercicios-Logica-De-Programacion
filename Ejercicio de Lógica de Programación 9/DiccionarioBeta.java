package ejercicio9;

import java.util.Scanner; //Se importa Scanner
import java.util.HashMap; //Se importa HashMap

public class DiccionarioBeta {
	public static void main(String [] args) {
		
		boolean aux1; 
		
        // Crear un objeto Scanner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);
		
        // Crear un diccionario que almacena las traducciones de palabras en español a inglés
		HashMap <String, String> diccionario = new HashMap<String, String>();
		
		// Agregar palabras al diccionario
		diccionario.put("gato", "cat");
		diccionario.put("perro", "dog");
		diccionario.put("ventana", "window");
		diccionario.put("puerta", "door");
		diccionario.put("lapiz", "pencil");
		diccionario.put("pluma", "pen");
		diccionario.put("pollito", "chicken");
		diccionario.put("gallina", "hen");
		diccionario.put("computadora", "computer");
		diccionario.put("teclado", "keyboard");
		diccionario.put("cabeza", "head");
		diccionario.put("cabello", "hair");
		diccionario.put("cuerpo", "body");
		diccionario.put("agua", "water");
		diccionario.put("cafe", "coffee");
		diccionario.put("diccionario", "dictionary");
		diccionario.put("raton", "mouse");
		diccionario.put("libro", "book");
		diccionario.put("silla", "chair");
		diccionario.put("nombre", "name");
		
		// Solicitar al usuario que ingrese una palabra en español
		System.out.println("Ingresa una palabra en español:");
        // Leer la palabra ingresada por el usuario y convertirla a minúsculas
		String palabra = sc.nextLine().toLowerCase();
		// Verificar si la palabra contiene solo letras (expresión regular)
		if(palabra.matches("^[a-zA-Z]+$")) {
			aux1 = diccionario.containsKey(palabra);
			if(aux1 == true) {
                // Si la palabra está en el diccionario, imprimir la traducción al inglés
				System.out.println("La traduccion en ingles es: [" + diccionario.get(palabra) + "]");
			}else {
                // Si la palabra no está en el diccionario, mostrar un mensaje de error
				System.out.println("La palabra no se encuentra en el diccionario");
			}
		}else {
            // Si la palabra contiene caracteres que no son letras, mostrar un mensaje de error
			System.out.println("Solo se admiten letras");
		}
		
		sc.close(); // Se cierra el Scanner
	}
}
