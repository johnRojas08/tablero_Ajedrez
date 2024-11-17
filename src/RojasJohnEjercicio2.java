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

        // Imprimir tablero de ajedrez
        System.out.println("\nTablero de ajedrez:");
        for (int filas = 0; filas < 8; filas++) { // 8 filas del tablero
            for (int linea = 0; linea < tamaño; linea++) { // Imprime las líneas de cada fila
                for (int columnas = 0; columnas < 8; columnas++) { // 8 columnas del tablero
                    // Determinar si la casilla es blanca o negra
                    if ((filas + columnas) % 2 == 0) {
                        // Casilla blanca: espacio vacío
                        for (int i = 0; i < tamaño; i++) {
                            System.out.print(" ");
                        }
                    } else {
                        // Casilla negra: imprimir el patrón
                        for (int i = 0; i < tamaño; i++) {
                            System.out.print(patron);
                        }
                    }
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
