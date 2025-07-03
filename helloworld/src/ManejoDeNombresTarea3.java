import java.util.Scanner;

public class ManejoDeNombresTarea3 {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        String nombre1 = "";
        String nombre2 = "";
        String nombre3 = "";

        for (int i = 0; i < 3; i++) {

            if (i == 0) {
                System.out.println("Ingrese nombre" + (i + 1));
                nombre1 = scanner.nextLine();
            } else if (i == 1) {
                System.out.println("Ingrese nombre" + (i + 1));
                nombre2 = scanner.nextLine();

            } else {
                System.out.println("Ingrese nombre" + (i + 1));
                nombre3 = scanner.nextLine();
            }


        }
        System.out.println("Recibido,gracias");

//        for (int t = 0; t < 3; t++) {
//            if (t == 0) {
//                System.out.println("...");
//            } else if (t == 1) {
//                System.out.println("....");
//            } else if (t == 2) {
//                System.out.println(".....");
//            }
//
//        }

        System.out.println("...");
        Thread.sleep(1000);
        System.out.println("....");
        Thread.sleep(1000);
        System.out.println(".....");
        Thread.sleep(1000);

        String variableFinal = elMetodoDeNicole(nombre1).concat("_")
                .concat(elMetodoDeNicole(nombre2).concat("_")
                        .concat(elMetodoDeNicole(nombre3)));
        System.out.println("La impresion Final es " + variableFinal);


//         esta es la base de la logica del metodo nicole
//        String nombreFormat1 = nombre1.substring(1, 2).toUpperCase();
//        String nombreFormat2 = nombre1.substring(nombre1.length() - 2);
//        String nombreFinal = nombreFormat1.concat(".") + nombreFormat2;
//        System.out.println("nombreFinal = " + nombreFinal);
//
//        String nombre2Format1 = nombre2.substring(1, 2).toUpperCase();
//        String nombre2Format2 = nombre2.substring(nombre2.length() - 2);
//        String nombre2Final = nombre2Format1.concat(".") + nombre2Format2;
//        System.out.println("nombreFinal = " + nombre2Final);
//
//        String nombre3Format1 = nombre3.substring(1, 2).toUpperCase();
//        String nombre3Format2 = nombre3.substring(nombre3.length() - 2);
//        String nombre3Final = nombre3Format1.concat(".") + nombre3Format2;
//        System.out.println("nombreFinal = " + nombre3Final);


    }

    //se creo un metodo
    public static String elMetodoDeNicole(String nombreParaFormatear) {
        String nombreFormat1 = nombreParaFormatear.substring(1, 2).toUpperCase();
        String nombreFormat2 = nombreParaFormatear.substring(nombreParaFormatear.length() - 2);
        String nombreFinal = nombreFormat1.concat(".") + nombreFormat2;

        return nombreFinal;


    }


}






