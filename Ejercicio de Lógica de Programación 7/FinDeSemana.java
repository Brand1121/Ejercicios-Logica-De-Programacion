
import java.util.Scanner; // Se importa la clase Scanner


public class FinDeSemana {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Crea un objeto Scanner para recibir entrada del usuario.
        String dia;
        int hora, minutos, minutosTotales = 0;

        while (true) { // El codigo continuará hasta que se rompa con "break".
            int diasFaltantes = 0;
         // Pide el día de la semana hasta que sea válido
            do {
                System.out.println("Ingresa un día de la semana (Lunes-Viernes)");
                dia = sc.nextLine().toLowerCase(); // Lee el día de la semana y lo convierte a minúsculas.
            } while (!dia.equals("lunes") && !dia.equals("martes") && !dia.equals("miercoles") && !dia.equals("jueves") && !dia.equals("viernes"));

            // Pide la hora hasta que sea válida
            do {
                System.out.println("Ingresa una hora en formato 24hrs:");
                hora = sc.nextInt();
            } while (hora < 0 || hora > 23);

            // Pide los minutos hasta que sean válidos
            do {
                System.out.println("Ingresa los minutos:");
                minutos = sc.nextInt();
            } while (minutos < 0 || minutos > 59);

         // Calcula los minutos que faltan para el viernes a las 15:00
            if (dia.equals("viernes")) {
                if (hora == 15) {
                    if (minutos > 0) {
                        diasFaltantes = 7; // Si es viernes a las 15:00 con minutos, son 7 días
                        minutosTotales = (diasFaltantes * 24 * 60) - minutos;
                    } else {
                        System.out.println("Justo a tiempo");
                        break; // Rompe el bucle ya que llegó a tiempo.
                    }
                } else {
                    minutosTotales = ((15 - hora) * 60) - minutos;
                }
            } else { // Calcula los minutos que faltan para el próximo viernes desde el día actual.
                switch (dia) {
                    case "lunes":
                        diasFaltantes = 4;
                        break;

                    case "martes":
                        diasFaltantes = 3;
                        break;

                    case "miercoles":
                        diasFaltantes = 2;
                        break;

                    case "jueves":
                        diasFaltantes = 1;
                        break;
                }
                minutosTotales = (diasFaltantes * 24 * 60) + ((15 - hora) * 60) - minutos;
            }
            break;
        }
        // Muestra los minutos faltantes.
        System.out.println("Los minutos que faltan para el viernes a las 15:00 son: " + minutosTotales + " minutos");
        sc.close();
    }
}
