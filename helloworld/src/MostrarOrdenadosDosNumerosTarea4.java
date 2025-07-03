import java.util.Scanner;

public class MostrarOrdenadosDosNumerosTarea4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max=0;
        int min=0;

        System.out.println("Ingrese el primer numero");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero");
        int numero2 = scanner.nextInt();

     //  String  max=(numero1>numero2)?numero1+"\n"+ numero2:numero2 +"\n"+numero1;

        max=(numero1>numero2)?numero1:numero2;
        min=(numero2<numero1)?numero2:numero1;



        System.out.println("Numeros ordenados de mayor a menor\n"+ max +'\n'+min);




    }
}
