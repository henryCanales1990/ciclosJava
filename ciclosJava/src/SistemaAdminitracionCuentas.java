import java.sql.SQLOutput;
import java.util.Scanner;

public class SistemaAdminitracionCuentas {
    static void main(String[] args) {
        var consola = new Scanner(System.in);

        var salir = false;

        //comenzar iteraccion del menu

        while (!salir){
            System.out.print("""
                    *** Sistema de Administracion de Cuentas ***
                    Menu :
                    1. Crear Cuenta
                    2. Eliminar Cuenta
                    3. Salir
                    Escoge una opcion:\s""");
            var opcion = consola.nextInt();
            //eVALUAR CADA OPCION
            switch (opcion){
                case 1 -> System.out.println("Creando Cuenta...\n");
                case 2 -> System.out.println("Eliminando Cuenta...\n");
                case 3 -> {
                    System.out.println("Saliendo del Sistema. Hasta pronto..");
                    salir = true;
                }
                default -> System.out.println("Opcion Invalida...\n");
            }
        }
        System.out.println("Fin del Sistema de Administracion de Cuentas");
    }
}
