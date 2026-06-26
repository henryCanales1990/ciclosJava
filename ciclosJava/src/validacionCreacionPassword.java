import java.util.Scanner;

public class validacionCreacionPassword {
    static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.println("***Validacion de Password***");

        System.out.print("Ingresa un password (de al menos 6 caracteres): ");
        var password = consola.nextLine();
        // Validacion de pasword
        while (password.length()<6){
            System.out.println("El password no cumple con los requisitos debe tener al menos 6 caracteres ");
            System.out.print("Ingresa un nuevo valor de password : ");
            password = consola.nextLine();


        }

        System.out.println("El valor de password es valido :  "+password);

    }
}
