import java.util.Scanner;

public class calculadora {
    static void main(String[] args) {

        var consola = new Scanner(System.in);
        var salir = false;

        while (!salir){
            System.out.print("""
                    *** Sistema de Administracion de Cuentas ***
                    Menu :
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Divicion
                    5. Salir
                    Escoge una opcion:\s""");
            var opcion = consola.nextInt();
            switch (opcion){
                case 1-> {
                    System.out.print("Dame el valor 1 :");
                    var valor1 = consola.nextDouble();
                    System.out.print("Dame el valor 2 :");
                    var valor2 = consola.nextDouble();
                    var suma = valor1 + valor2;
                    System.out.println("suma = " + suma);
                }
                case 2-> {
                    System.out.print("Dame el valor 1 : ");
                    var valor1 = consola.nextDouble();
                    System.out.print("Dame el valor 2 : ");
                    var valor2 = consola.nextDouble();
                    var resta = valor1 - valor2;
                    System.out.println("Resta = " + resta);
                }
                case 3-> {
                    System.out.print("Dame el valor 1 : ");
                    var valor1 = consola.nextDouble();
                    System.out.print("Dame el valor 2 : ");
                    var valor2 = consola.nextDouble();
                    var multiplicacion = valor1 * valor2;
                    System.out.println("Multiplicacion  = " + multiplicacion);
                }
                case 4->{
                    System.out.print("Dame el valor 1 : ");
                    var valor1 = consola.nextDouble();
                    System.out.print("Dame el valor 2 : ");
                    var valor2 = consola.nextDouble();
                    if (valor2!=0){
                        var divicion = valor1 / valor2;
                        System.out.println("divicion = " + divicion);
                    }
                    else
                        System.out.println("Error Divicion por cero.");

                }
                case 5-> {
                    System.out.println("Saliendo del programa de Calculadora !");
                salir = true;
                }
                default -> System.out.println("Opcion Invalida...\n");
            }

        }
    }
}
