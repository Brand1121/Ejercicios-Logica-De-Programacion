
import java.util.HashMap; //Se importa la clase HashMap
import java.util.Map; // Se importa Map
import java.util.Random; // Importa la clase Random
import java.util.Scanner; //Importa Scanner

public class Diccionario { // Declaración de la clase "Diccionario"
    public static void main(String[] args) { // Declaración del método principa

        Scanner sc = new Scanner(System.in); // Creación de un objeto Scanner para la entrada del usuario
        Random random = new Random(); // Creación de un objeto Random para generar números aleatorios
        // Delcaracion de variables tipo int
        int numeroRandom, i, j, contPalabCorrectas = 0, contPalabIncorrect = 0;
        
        // Creación de un diccionario que almacena las traducciones de palabras en español a inglés
        HashMap<String, String> diccionario = new HashMap<String, String>();

     // Agregar palabras al diccionario con su traducción correspondiente
        diccionario.put("gato", "cat"); diccionario.put("perro", "dog");
        diccionario.put("ventana", "window"); diccionario.put("puerta", "door");
        diccionario.put("lapiz", "pencil"); diccionario.put("pluma", "pen");
        diccionario.put("pollito", "chicken"); diccionario.put("gallina", "hen");
        diccionario.put("computadora", "computer"); diccionario.put("teclado", "keyboard");
        diccionario.put("cabeza", "head"); diccionario.put("cabello", "hair");
        diccionario.put("cuerpo", "body"); diccionario.put("agua", "water");
        diccionario.put("cafe", "coffee"); diccionario.put("diccionario", "dictionary");
        diccionario.put("raton", "mouse"); diccionario.put("libro", "book");
        diccionario.put("silla", "chair"); diccionario.put("nombre", "name");
        diccionario.put("casa", "house"); diccionario.put("carro", "car");
        diccionario.put("sol", "sun"); diccionario.put("luna", "moon");
        diccionario.put("flor", "flower"); diccionario.put("arbol", "tree");
        diccionario.put("rio", "river"); diccionario.put("montaña", "mountain");
        diccionario.put("playa", "beach"); diccionario.put("comida", "food");
        diccionario.put("familia", "family"); diccionario.put("amigo", "friend");
        diccionario.put("escuela", "school"); diccionario.put("viaje", "trip");
        diccionario.put("ropa", "clothes"); diccionario.put("pelicula", "movie");
        diccionario.put("mar", "sea"); diccionario.put("juego", "game");
        diccionario.put("ciudad", "city"); diccionario.put("amor", "love");
        

        // Inicio de un bucle para seleccionar palabras al azar
        for (i = 0; i < 5; i++) {
            j = 1;
            String valorEnPosicion = null;
            String keyEnPosicion = null;
            // Numero random del 0 al 40
            numeroRandom = random.nextInt(40);
            
            // Recorrido del diccionario para seleccionar una palabra aleatoria
            for (Map.Entry<String, String> entry : diccionario.entrySet()) {
                if (j == numeroRandom) {
                    valorEnPosicion = entry.getValue(); // Obtiene la traducción en inglés de la palabra actual
                    keyEnPosicion = entry.getKey(); // Obtiene la palabra en español actual
                    System.out.println("Ingresa la traduccion de esta palabra: " + keyEnPosicion);
                    String palabra = sc.nextLine();
                    // Comprobar si la traducción ingresada por el usuario es correcta
                    if (!palabra.equals(valorEnPosicion)) {
                    	// Si la traducción es incorrecta, aumenta el contador de palabras incorrectas
                        contPalabIncorrect++; 
                    } else {
                    	// Si la traducción es correcta, aumenta el contador de palabras correctas
                        contPalabCorrectas++;
                    }
                    break; // Sale del bucle ya que hemos procesado una palabra aleatoria
                }
                j++; // Aumenta el contador "j" para comparar con el siguiente número aleatorio
            }
        }
        // Mostrar el total de palabras correctas e incorrectas
        System.out.println("El total de palabras correctas son: " + contPalabCorrectas);
        System.out.println("El total de palabras incorrectas son: " + contPalabIncorrect);

        sc.close(); // Cierre del objeto Scanner
    }
}

