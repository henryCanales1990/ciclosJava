public class numerosImpares {
    static void main(String[] args) {

        System.out.println("*** Numeros Impares del 1 al 20 ***");

        var contador = 1;
        do {
            if (contador % 2 != 0)
                System.out.print(contador + " ");

            contador++; // El incremento va aquí, al final
        } while (contador <= 20);

    }
}
