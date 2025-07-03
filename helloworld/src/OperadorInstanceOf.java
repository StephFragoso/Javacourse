public class OperadorInstanceOf {
    public static void main(String[] args) {

        String texto= ("Creando un objeto de la clase String...que tal!");
        Integer num= (7);

       boolean b1= texto instanceof String;
       System.out.println("texto es del tipo String = " + b1);

        b1= texto instanceof Object;
        System.out.println("texto es del tipo Object = " + b1);

        b1= num instanceof Integer;
        System.out.println("num es del tipo Integer= " + b1);

        b1= num instanceof Number;
        System.out.println("num es del tipo Number = " + b1);

        b1= num instanceof Object;
        System.out.println("num es del tipo Object = " + b1);

        Double decimal= 45.54;//aqui estoy creando un objeto del tipo Double por eso la mayuscula al incio, es del tipo referencia con la minuscula es del tipo primitivo y no se puede usar el instanceof
        b1= decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + b1);





    }
}
