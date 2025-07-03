public class ConversionDeTipos {
    public static void main(String[] args) {

        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43e-3";
        double realDouble0 = Double.parseDouble(realStr);
        System.out.println("realDouble0 = " + realDouble0);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        //Conversiones de tipo primitivo a cadenas

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        //tener cuidado con esto ya que nos podemos equivoca al utilizar valueof ya que recibe diferentes tipos
        //y puede concatenar en lugar de hacer una conversion o una suma al utilizar numeroStr.
        otroNumeroStr = String.valueOf(otroNumeroStr + 10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        //esta seria la manera correcta , verificamos que diga Int para que haga la suma y no concatene
        otroNumeroStr = String.valueOf(otroNumeroInt + 10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble=1.23456e2;
        String otroRealStr=Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr=String.valueOf(1.23456f);
        System.out.println("otroRealStr = " + otroRealStr);

        //Conversion de primitivos a primitivos

        int i=10000;
        short s=(short)i;
        System.out.println("s = " + s);
        long l=i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        char b=(char)i;
        System.out.println("b= "+b);
        float f= (float)i;
        System.out.println("f=" + f);



    }
}



