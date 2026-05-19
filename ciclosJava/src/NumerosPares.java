public class NumerosPares {
    static void main(String[] args) {
        System.out.println("*** Numeros pares del 1 al 20 ***");
        var contador = 0;
        while (contador <=20)
        {
            //revisamos si en un mumero par.
            if (contador % 2 == 0)
                System.out.print(contador + " ");
            contador++;
        }

    }
}
