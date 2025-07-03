public class PrimitivosFloat {
    public static void main(String[] args) {

        float realFloat=1;
        System.out.println("realFloat = " + realFloat);
        float realFloat2=2.12e3f;//2120.0
        System.out.println("realFloat = " + realFloat2);
        System.out.println("float corresponde en byte a" + Float.BYTES);
        System.out.println("float corresponde en bites a" + Float.SIZE);
        System.out.println("valor maximo para float" +  Float.MAX_VALUE);
        System.out.println("valor minimo para float " + Float.MIN_VALUE);


        double realDouble=1.6;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a" + Double.BYTES);
        System.out.println("double corresponde en bites a" + Double.SIZE);
        System.out.println("valor maximo para double " +  Double.MAX_VALUE);
        System.out.println("valor minimo para double " + Double.MIN_VALUE);

        var varFlotante=3.1416f;
        System.out.println("varFlotante = " + varFlotante);


    }
}
