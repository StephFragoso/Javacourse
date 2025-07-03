public class EjemploString {
    public static void main(String[] args) {
        String curso= "Programacion Java"; //de forma literal
        String curso2=new String("Programacion Java");//de forma explicita

       //por eso en este metodo da false porque son dos objetos distintos, ya que se crean  de manera distinta
       // y este metodo compara la referencia, el objeto, no el valor.
        boolean esIgual= curso==curso2;
        System.out.println("esIgual="+ esIgual);


       //en este da true porque este compara el valor o atributo(texto)
        esIgual= curso.equals(curso2);
        System.out.println("esIgual="+esIgual);

        //con este metodo no importa si cambia algo en el valor (mayusculas o minusculas) lo tomara como true.
        esIgual= curso.equalsIgnoreCase(curso2);
        System.out.println("esIgual="+esIgual);

        //en este caso da true porque los dos son  el mismo objeto y comparten el mismo valor (se crearon de manera literal)
        String curso3="Programacion Java";
        esIgual= curso == curso3;
        System.out.println("esIgual="+esIgual);



    }
}
