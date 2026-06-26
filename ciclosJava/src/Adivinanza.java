import java.util.Random;
import java.util.Scanner;

public class Adivinanza{
    public static void main(String[] args) {

        var random = new Random();
        var scanner = new Scanner(System.in);

        var numeroSecreto = random.nextInt(100) + 1;
        var intentos = 0;

        // Es vital inicializarla en 0 para que la condición del while sea verdadera al inicio
        var adivinanza = 0;

        final var MAX_INTENTOS = 10;

        System.out.println("*** JUEGO DE ADIVINANZAS (WHILE) ***");
        System.out.println("He pensado un número del 1 al 100. ¡Tienes solo 10 intentos!");






        // El ciclo pregunta ANTES de entrar
        while (adivinanza != numeroSecreto && intentos < MAX_INTENTOS) {

            System.out.print("Intento " + (intentos + 1) + "/" + MAX_INTENTOS + " - Ingresa tu número: ");
            adivinanza = scanner.nextInt();
            intentos++;

            // Las pistas se mantienen igual
            if (adivinanza < numeroSecreto && intentos < MAX_INTENTOS) {
                System.out.println("Pista: El número secreto es MAYOR.");
            } else if (adivinanza > numeroSecreto && intentos < MAX_INTENTOS) {
                System.out.println("Pista: El número secreto es MENOR.");
            }
        }

        // La validación final al salir del ciclo no cambia
        if (adivinanza == numeroSecreto) {
            System.out.println("\n¡BINGO! Adivinaste el número en " + intentos + " intentos.");
        } else {
            System.out.println("\n¡Game Over! Te has quedado sin intentos.");
            System.out.println("El número secreto era: " + numeroSecreto);
        }

        scanner.close();
    }
}