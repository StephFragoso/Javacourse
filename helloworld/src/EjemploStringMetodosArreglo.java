public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {


        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() =" + trabalenguas.length());//length en el string es un metodo
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;//aqui lenght es un atributo, una propiedad
        System.out.println("largo =" + largo);
        for ( int i=0; i< largo; i++){
            //System.out.println(" arreglo = " + arreglo[i]);
            //System.out.print( arreglo[i]);
            System.out.println( arreglo[i]);//los dos anteriores son diferentes maneras de imprimir la misma palabra

            System.out.println("\ntrabalenguas = "+ trabalenguas.split("a"));//aqui le estoy diciendo que la a es el separador

            //aqui lo voy a convertir en String el anterior es un char
            String[] arreglo2= trabalenguas.split("a");
            int l= arreglo2.length;
            for(int j=0; j<l; j++){
                System.out.println(arreglo2[j]);
            }

            String archivo= "alguna.imagen.pdf";
            String[] archivoArr= archivo.split("[.]");//los corchetes es para indicar un caracter de manera literal , especifica o con "\\."
            l=archivoArr.length;
            for(int j=0; j<l; j++){
                System.out.println(archivoArr[j]);
            }

            System.out.println("extension  = " + archivoArr[l-1]);





        }


















    }
}
