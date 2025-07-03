import java.util.Scanner;

public class EstanqueGasTarea5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


     System.out.println("Cual es la medida actual en litros?");
     double medida = scanner.nextDouble();

     if (medida == 70){
            System.out.println("Estanque lleno" );

        } else if ( medida >=60 && medida<70) {
         System.out.println("Estanque casi lleno" );
         
        } else if (medida >=40 && medida<60) {
         System.out.println("Estanque 3/4");

     } else if (medida >= 35 && medida <40) {
         System.out.println("Medio Estanque");

     } else if ( medida >=20 && medida<35) {
         System.out.println("Suficiente");

     } else if ( medida >=1 && medida<20) {
         System.out.println("Insuficiente");

     }else {
         System.out.println("Lo siento ingrese un numero valido de litros");
         main(args);
         System.exit(0);
     }

    }


    }

