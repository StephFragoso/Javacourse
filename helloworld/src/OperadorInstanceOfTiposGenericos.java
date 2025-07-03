public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

      Object texto= "Creando un objeto de la clase String...que tal!";//al usar object es generico
 //       Number num= (7);//aqui al usar Number es del tipo generico de Integer


//    cuando creamos una instancia de un numero , ya sabemos que no podemos crear un new Integer, new float , etc de un objeto esta tachado no se debe hacer
//    la manera correcta es el autoboxing, es decir, colocar en la literal el valor primitivo del entero
        Number num =Integer.valueOf(7);//seria lo mismo que el anterior pero de manera literal, los dos estan bien
        //si lo hacemos como el primero, lo que hace el Java por detras es justo esto de Integer.valueOf()
        // lo mismo seria con el float, double, etc.


       boolean b1= texto instanceof String;
       System.out.println("texto es del tipo String = " + b1);

        b1= texto instanceof Object;
        System.out.println("texto es del tipo Object = " + b1);


   //   aqui al hacer una clase Object nos permite hacer este instanceof sin marcar error de sintaxis como en el episodio anterior
  //      el resultado es false porque al final el valor de texto es String no del tipo Integer, por lo tanto no tienen nada en comun
        b1=texto instanceof  Integer;
        System.out.println("texto es del tipo Integer = " + b1);


        b1= num instanceof Integer;
        System.out.println("num es del tipo Integer= " + b1);

        b1= num instanceof Number;
        System.out.println("num es del tipo Number = " + b1);

        b1= num instanceof Object;
        System.out.println("num es del tipo Object = " + b1);

        //   aqui al hacer una clase Number nos permite hacer este instanceof sin marcar error de sintaxis como en el episodio anterior
        //    el resultado es false porque al final el valor de num es Integer no del tipo Long, por lo tanto no tienen nada en comun
        b1 = num instanceof Long;
        System.out.println("num es del tipo Long = " + b1);


        //comprobando lo mismo que en el anterior por eso da false
        b1= num instanceof Double;
        System.out.println("num es del tipo Double = " + b1);



      Number decimal= 45.54;//aqui estoy creando un tipo generico con el NUmber
        b1= decimal instanceof Double;
        System.out.println("decimal es del tipo Double = " + b1);

        b1= decimal instanceof Float;
        System.out.println("decimal es del tipo Float = " + b1);//aqui da resultado false porque no es tipo float
        //para que diera true deberia estar declaro asi :decimal =45.54f; necesita la f para afirmar que es un float

        b1= decimal instanceof Integer;
        System.out.println("decimal es del tipo Integer = " + b1);//aqui da false porque es un double y si estuviera declarado con la f como float tmbn seria false


        b1= decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + b1);





    }
}
