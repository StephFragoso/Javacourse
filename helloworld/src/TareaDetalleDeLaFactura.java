import java.util.InputMismatchException;
import java.util.Scanner;

public class TareaDetalleDeLaFactura
{
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese numero de factura");
        String numeroFactura= scanner.nextLine();


        if( numeroFactura.matches(".*[A-Za-z].*") && numeroFactura.matches(".*[0-9].*")){
            System.out.println("Gracias");
        }else  {
            System.out.println("Lo siento debe ingresar al menos una letra");
            main(args);
            System.exit(0);
        }






    }
}
