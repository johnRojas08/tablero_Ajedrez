import java.util.Scanner;

public class RojasJohnEjercicio2 {
    public static void main(String[] args) {

        // Declarar variables necesarias
        Scanner scanner = new Scanner(System.in);
        char pattern;

        // Solicitar el patrón al usuario
        System.out.print("Introduce el patrón para las casillas: ");
        pattern = scanner.next().charAt(0);

        // Imprimir el patrón ingresado (para probar este paso)
        System.out.println("El patrón elegido es: " + pattern);

        scanner.close();
    }
}