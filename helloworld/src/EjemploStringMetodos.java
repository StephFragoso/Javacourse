public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Steph";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Steph\") = " + nombre.equals("Steph"));
        System.out.println("nombre.equals(\"steph\") = " + nombre.equals("steph"));//aqui es false porque el valor en la variable empieza co nmayuscula Steph
        System.out.println("nombre.equalsIgnoreCase(\"steph\") = " + nombre.equalsIgnoreCase("steph"));
        System.out.println("nombre.compareTo(\"Steph\") = " + nombre.compareTo("Steph"));
        System.out.println("nombre.compareTo(\"Chitin\") = " + nombre.compareTo("Chitin"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(2));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(3));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(4));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1)); //esta seria otra manera de obtener la ultima letra
        System.out.println("nombre.substring(2) = " + nombre.substring(2));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));//aqui es como el anterio pero le estoy diciendo de donde a donde ,notar que el 4 no se incluye al imprimir en realidad lo hace hasta el que seria el 3 o sea la p
        System.out.println("nombre.substring(3,5) = " + nombre.substring(3,5));//aqui quiero imprimir los ultimos dos por eso agrego el 5 para que incluya el 4 en la impresion
        System.out.println("nombre.substring(4) = " + nombre.substring(4));//aqui lo estoy pidiendo de manera literal el ultimo caracter o sea la h
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));//aqui estoy pidiendo el ultimo caracter o sea la h de una manera mas dinamica
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));//aqui le estoy pidiendo los ultimos dos o sea ph


        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));//aqui le estoy diciendo que quiero cambiar las "a" por puntos "."
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf('j') = " + trabalenguas.indexOf('j'));// da -1 cuando da negativos es que no encontro el caracter que le pedimos
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s"));
        System.out.println("  trabalenguas  ");
        System.out.println("trabalenguas".trim());//metodo para quitar los espacios en blanco


































    }
}
