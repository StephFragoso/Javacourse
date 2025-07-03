import javax.swing.*;

public class OperadoresAritmetico {
    public static void main(String[] args) {

        int i=5; int j=4;  //cuando son del mismo tipo se pueden definir en la misma linea
       //int i=5, j=4; esta seria otra manera de  definir

        int suma= i+j;
        System.out.println("suma = " + suma);
        System.out.println("i +j  ="+ i+j);//aqui da 54 porque solo concatena porque en orden empieza con un string y no puede pasarse a la suma
        System.out.println(i + j +"i +j =");//aqui da 9 porque si hace la suma, debido al orden
        System.out.println("i +j  ="+ (i+j));//aqui si realiza la suma porque los parentesis llevan preferencia y primero realiza la operacion

        int resta = i-j;
        System.out.println("resta = " + resta);
        //la resta y todas las demas operaciones aritmeticas necesitan si o si los parentesis para que se reconozca la operacion ya que al unico
        // que reconoce el string es el + porque concatena , con los demas marca error.

        int multiplicacion = i*j;
        System.out.println("multiplicacion = " + multiplicacion);

        int div= i/j;
        float div2= i/j;
        float div3=(float) i/j; //tambien podria ser asi float div3= (float)i/(float)j;

        System.out.println("div = " + div);//aqui da 1 porque como la variable es un int redondea para ser un entero
        System.out.println("div2 = " + div2);//aqui se cambia la variable a float para que de decimal, ya que el resultado es 1.25
        System.out.println("div3 = " + div3);//aqui tmbn da 1.25  se hizo para ver el ejemplo de poner dos cast de float

        int resto = i%j;//esto se utiliza para conocer cuanto es lo que sobra de la division entera (cuantas veces cabe i en j)
        //cuando el resultado es 0 es porque es numero par no sobra nada
        System.out.println("resto = " + resto);



        //en este ejemplo se usan las clases Integer y JOPtionpane.showInputDialog para obtner un numero enetero del usario utilizando una box
        int numero=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        if (numero % 2 ==0){
            System.out.println("numero par ="+ numero);
        }else{
            System.out.println("numero impar ="+numero);
        }




    }
}
