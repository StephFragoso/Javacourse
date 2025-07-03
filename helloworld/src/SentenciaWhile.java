public class SentenciaWhile {
    public static void main(String[] args) {

        int i = 0;
        while (i < 5) {
            System.out.println("i=" + i);
            i++;
        }

        i = 0;
        boolean prueba = true;
        while (prueba) {
            if (i == 7) {
                prueba = false;
            }
            System.out.println("i=" + i);
            i++;
        }

        //ejemplo del While con false , nunca se va a ejecutar
        //el while es pre prueba, primero evalua y despues decide si ejecuta o no dependiendo de la condicion
        prueba = false;
        while (prueba) {
            System.out.println(" nunca se ejecuta");
        }

        //ejemplo con Do While , se va a ejecutar al menos una vez mientras sea true.
        //el do while es post prueba, primero ejecuta y despues evalua
        prueba = false;
        do {
            System.out.println("  se ejecuta al menos una vez");
        }while (prueba);

    //ejemplo do while, es util cuando se necesita primero realizar una accion antes de evaluar o verificar
        prueba = true;
        i=0;

        do {
            if (i == 10) {
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }while (prueba);
        }

    }

