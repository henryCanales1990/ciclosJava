public class acumuladorSumaFor {
    static void main(String[] args) {
        System.out.println("***Acumulador SumaFOR***");

        final var MAXIMO = 5;
        var acumuladorSuma = 0;


        for (var numero = 1; numero<=MAXIMO; numero++){

            System.out.println(numero+"+" +acumuladorSuma);

        acumuladorSuma = acumuladorSuma + numero;}

        System.out.println(acumuladorSuma);
    }
}
