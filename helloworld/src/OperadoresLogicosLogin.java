import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String username= "Steph";
        String password= "12345";

//  ejemplo de tener autenticado dos usarios
        String username2= "Admin";
        String password2= "12345";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el username");
        String u= scanner.next();

        System.out.println("Ingrese el password");
        String p= scanner.next();

        boolean esAutenticado =false;


 //   ejemplo de como tener dos usarios autenticados como seria el if usando el OR
        if ((username.equals(u)&& password.equals(p)) ||
                (username2.equals(u)&& password2.equals(p)) ){
            esAutenticado= true;
        }else{
            System.out.println("Username o contrasena incorrectos!");
        }



      //  if (username.equals(u)&& password.equals(p)){
      //      esAutenticado= true;
     //   }else{
      //      System.out.println("Username o contrasena incorrectos!");
     //   }

        if (esAutenticado){
            System.out.println("Bienvenido ".concat(username).concat("!"));

        }else {
            System.out.println("Lo siento, requiere autenticacion");
        }



    }
}
