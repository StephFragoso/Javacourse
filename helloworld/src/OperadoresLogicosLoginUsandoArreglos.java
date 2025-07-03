import java.util.Scanner;

public class OperadoresLogicosLoginUsandoArreglos {
    public static void main(String[] args) {

     /*   String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames[0] = "Steph";
        passwords[0] = "12345";
        usernames[1] = "Admin";
        passwords[1] = "12345";

        usernames[2] = "Aria";
        passwords[2] = "12345";*/

 //    otra manera de hacerlo seria la siguiente

        String []usernames ={"Steph","Admin","Aria"} ;
        String[] passwords ={"12345","12345","12345"};


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println("Ingrese el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            if ((usernames[i].equals(u) && passwords[i].equals(p))) {
                esAutenticado = true;
                break;
            }

        }

        if (esAutenticado) {
            System.out.println("Bienvenido ".concat(u).concat("!"));

        } else {
            System.out.println("Username o contrasena incorrectos!");
            System.out.println("Lo siento, requiere autenticacion");
        }

    }
}