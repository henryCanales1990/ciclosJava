public class AcumuladorSuma {
    static void main(String[] args) {
        System.out.println("*** Suma Acumumulativa ***");

        final var MAXIMO = 5;
        var acumuladorSuma = 0;

        // iterar los valores
        var numero = 1;
        while(numero<=MAXIMO){
            //imprimir lo que va a sumar
            System.out.println("(acumuladorSuma + numero)-> " + acumuladorSuma + " + " + numero);

            //Realizar la suma acumulativa
            acumuladorSuma += numero++;//acumuladorSuma  = acumuladorSuma + numero

            //suma parcial acumulada
            System.out.println("Suma parcial acumulada : "+acumuladorSuma + "\n");


        }
        System.out.println("Suma de los primeros  " + MAXIMO +  " numeros = : "+ acumuladorSuma);

    }
}
