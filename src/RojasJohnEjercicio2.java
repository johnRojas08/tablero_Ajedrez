import java.util.Scanner;

public class RojasJohnEjercicio2 {
    public static void main(String[] args) {

        // Declarar variables necesarias
        Scanner scanner = new Scanner(System.in);
        char patron;
        int tamaño;

        // Solicitar el patrón al usuario
        System.out.print("Introduce el patrón para las casillas: ");
        patron = scanner.next().charAt(0);

        // Solicitar el tamaño al usuario
        do {
            System.out.print("Introduce el tamaño de las casillas (1-15): ");
            tamaño = scanner.nextInt();
            if (tamaño < 1 || tamaño > 15) {
                System.out.println("Introduce un tamaño entre 1 y 15.");
            }
        } while (tamaño < 1 || tamaño > 15);

        // Imprimir una sola casilla del tamaño definido
        System.out.println("\nCasilla de ejemplo:");
        for (int i = 0; i < tamaño; i++) { // Filas de la casillo
            for (int j = 0; j < tamaño; j++) { // Columnas de la casilla
                System.out.print(patron);
            }
            System.out.println(); // Nueva linea despues de cada fila
        }
        scanner.close();
    }
}