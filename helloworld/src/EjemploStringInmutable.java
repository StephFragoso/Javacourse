public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso= "Programacion Java";
        String profesor="Andres Gonzalez";

        //aqui pensaria que concatena con profesor pero no solo lo hace con curso,
        //al imprimir solo imprime "curso=Programacion Java"
        curso.concat(profesor);
        System.out.println("curso="+curso);

       //aqui si concatena y al imprimir sale el nombre del profesor
        String resultado= curso.concat (profesor);
        System.out.println("resultado =" + resultado);

        //aqui estamos haciendo un boolean y da como resultado false
        System.out.println(curso == resultado);

        //aqui se esta aplicando una funcion de flecha para modificar el valor
        //del string pero igual imprime solo el curso, es decir, se mantiene inmutable
        curso.transform(c ->{
            return c + "con" + profesor;
                });
        System.out.println("curso =" + curso);


        //aqui se le asigna el string para que imprima completo y se le nombra una nueva variable
        String resultado2 = curso.transform(c ->{
            return c + " con " + profesor;
        });
        System.out.println("resultado2 = " +resultado2);

        //aqui se usa el metodo replace para cambiar a minuscula por mayuscula , pero
        //en este caso al imprimir no lo hace, es decir , se mantiene inmutable
        resultado.replace("a","A");
        System.out.println("resultado = " + resultado);

      //aqui se le asigna el string y se cambia de variable y aqui si se imprime con el cambio
       String resultado3= resultado.replace("a","A");
        System.out.println("resultado3 = " + resultado3);

     //conclusion de clase: cualquier cambio o metodo que modifica el string lo que hace es retornar
     // una nueva instancia pero la original se mantiene intacta no varia, el resultado se tiene que
     //guardar en otra variable
    }
}
