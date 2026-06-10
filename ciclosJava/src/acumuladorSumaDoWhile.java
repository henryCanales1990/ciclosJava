public class acumuladorSumaDoWhile {
    public static void main(String[] args) {
        System.out.println("***Acumulador Suma DO-WHILE***");

        final var MAXIMO = 5;
        var acumuladorSuma = 0;

        // 1. La variable de control se declara AFUERA del ciclo
        var numero = 1;

        // 2. Iniciamos el bloque 'do' (hacer)
        do {

            System.out.println(acumuladorSuma+"+"+numero);
            // Se realiza la suma
            acumuladorSuma = acumuladorSuma + numero;

            // 3. ¡Muy importante! Debemos incrementar el número manualmente
            numero++;

        } while (numero <= MAXIMO); // 4. La condición se evalúa al final

        System.out.println(acumuladorSuma);
    }
}