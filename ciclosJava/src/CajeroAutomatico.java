import java.util.Scanner;

public class CajeroAutomatico {
    static void main(String[] args) {
        var consola = new Scanner(System.in);

        double saldo = 1000.0;
        var salir = false;

        while (!salir){
            System.out.print("""
                    *** Sistema de Administracion de Cuentas ***
                    Menu :
                    1. Consultar saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoge una opcion:\s""");
            var opcion = consola.nextInt();
            switch (opcion){
                case 1 -> System.out.println("Su saldo es: $"+ saldo);
                case 2 -> {
                    System.out.println("Indrese la cantidad que desea retirar");
                    var cantidadRetirar = consola.nextDouble();
                    if (cantidadRetirar<=saldo){
                        saldo = saldo-cantidadRetirar;
                        System.out.println("Su nuevo saldo es : $"+ saldo);
                    }
                    else System.out.println("Su saldo es infuficiente");
                }
                case 3 -> {
                    System.out.println("Indrese la cantidad que desea Depositar");
                    var cantidadDepositar = consola.nextDouble();

                        saldo = saldo+cantidadDepositar;
                        System.out.println("Su nuevo saldo es $"+ saldo);

                }
                case 4 -> {
                    System.out.println("Saliendo del Sistema. Hasta pronto..");
                    salir = true;
                }
                default -> System.out.println("Opcion Invalida...\n");
            }
        }
    }
}
