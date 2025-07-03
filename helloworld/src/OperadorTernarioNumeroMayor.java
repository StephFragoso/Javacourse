import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {


        int max=0;

        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num1= scanner.nextInt();

        System.out.println("Ingrese un segundo numero");
        int num2= scanner.nextInt();

        System.out.println("Ingrese un tercer numero");
        int num3= scanner.nextInt();

        System.out.println("Ingrese un cuarto numero");
        int num4= scanner.nextInt();


        max= (num1>num2)?num1:num2;// valor de max se asigna... si num1 es mayor que num2 asignamos num1 como  mayor max, si no se cumple retornamos num2 como numero mayor o sea valor de max
        max=(max>num3)?max:num3;// si max es mayor que num3 retornamos max como numero mayor, si no se cumple retornamos num3 como mayor
        max=(max>num4)?max:num4;


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        System.out.println("el numero mayor es:" + max);



    }
}
