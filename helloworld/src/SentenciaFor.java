public class SentenciaFor {
    public static void main(String[] args) {


        //int i=0;este fue un ejemplo declarando la variable fuera del for
        for (int i = 0; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        // System.out.println("i = " + i);es parte del ejemplo con la variable fuera del for

        for (int i = 10; i >= 0; i--) {
            System.out.println("i = " + i);

        }

        for (int i = 1, j = 10; i < j; i++, j--) {
            System.out.println(i + "-" + j);
        }


        //este ejemplo es de querer imprimir numeros impares
        for (int i = 0; i <= 10; i++) {

            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i = " + i);
        }


        //este ejemplo es de imprimir numeros pares
           /* for (int i = 0; i <= 10; i++) {

                if ( i % 2 !=0){
                    continue;
                }
                System.out.println("i = " + i);

            }*/


    }
}
