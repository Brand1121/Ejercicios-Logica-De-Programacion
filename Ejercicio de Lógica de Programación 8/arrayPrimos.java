
import java.util.Scanner; //Importamos Scanner

public class arrayPrimos {
    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
        int i, j, primosTotal = 0, numerosFaltantes = 0;

        // Declaración de arreglos para los números originales, números primos y números no primos.
        int[] numerosArray = new int[10];
        int[] numerosPrimos = new int[10];
        int[] numerosRestantes = new int[10];

        // Solicita al usuario ingresar 10 números.
        for (i = 0; i < 10; i++) {
            System.out.println("Ingrese el " + (i + 1) + " número: ");
            numerosArray[i] = sc.nextInt();
        }

        // Verifica si los números son primos o no.
        for (i = 0; i < 10; i++) {
        	// Si el número es menor o igual a 1 o es un número par distinto de 2, se considera no primo.
            if (numerosArray[i] <= 1 || (numerosArray[i] % 2 == 0 && numerosArray[i] != 2)) {
                numerosRestantes[numerosFaltantes] = numerosArray[i];
                numerosFaltantes++;
            } else {
                boolean esPrimo = true;
                for (j = 2; j < numerosArray[i] / 2; j++) {
                    if (numerosArray[i] % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                	// Si el número es primo, se almacena en el arreglo de números primos.
                    numerosPrimos[primosTotal] = numerosArray[i];
                    primosTotal++;
                } else {
                	// Si no es primo, se almacena en el arreglo de números no primos.
                    numerosRestantes[numerosFaltantes] = numerosArray[i];
                    numerosFaltantes++;
                }
            }
        }

        // Muestra el arreglo original.
        System.out.println("//////  Array original: //////");
        for (i = 0; i < 10; i++) {
            System.out.println("pos [" + i + "] = " + numerosArray[i]);
        }

     // Muestra el arreglo de números primos.
        System.out.println("//////  Array Ordenado: //////");
        for (i = 0; i < primosTotal; i++) {
            System.out.println("pos [" + i + "] = " + numerosPrimos[i]);
        }

        // Muestra el arreglo de números no primos.
        for (i = 0; i < numerosFaltantes; i++) {
            System.out.println("pos [" + (i + primosTotal) + "] = " + numerosRestantes[i]);
        }
        
        sc.close();
    }
    
}
