public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso= "Programacion Java"; //de forma literal
        String profesor="Andres Gonzalez";

        String detalle= curso +" con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA=10;
        int numeroB=5;

        //en este da 105 porque concatena ya que detalle es un string y se encuentra a la izquierda
        //el programa asume que se trata de una cadena, las expresiones se van evaluando de izquierda a derecha.
        System.out.println(detalle + numeroA + numeroB);

        //con los parentesis cambiamos la presedencia es decir el orden en que se evaluan o ejecutan estas operaciones
        // en este caso va a primero sumar despues va a concatenar.Aqui da 15
        System.out.println(detalle +( numeroA + numeroB));

        //aqui cambiamos el orden para ver como si influye primero muestra el 15 y despues el texto.
        System.out.println(numeroA +numeroB+ detalle);

        //aqui esta utilizando el metodo concat para concatenar sin el simbolo+
        String detalle2= curso.concat(profesor);
        System.out.println("detalle2=" +detalle2);

        //aqui solo lo hizo para darle un espacio el colocar las ""
        detalle2= curso.concat(" ".concat(profesor));
        System.out.println("detalle2=" +detalle2);

        //aqui en las "" puso con y concateno con profesor
        detalle2= curso.concat(" con ".concat(profesor));
        System.out.println("detalle2=" +detalle2);

        //aqui esta concatenando el curso y profesor
        detalle2= curso.concat(" con ").concat(profesor);
        System.out.println("detalle2=" +detalle2);

         //NOTA:EXISTEN DOS FORMAS DE CONCATENAR CON EL OPERADOR + Y
        //EL METODO CONCAT.


    }
}
