public class EjjemploStringValidar {
    public static void main(String[] args) {

        String curso = null;//sin referencia sin una instancia

        boolean esNulo= curso == null;//aqui se esta validando
        System.out.println("esNulo = " + esNulo);

        if (esNulo){
           //curso =" ";// "Programacion Java";
            curso ="Programacion Java";
        }

        boolean esVacio = curso.length() ==0;
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2= curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco= curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);

        if (esBlanco== false){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }

         //estas serian todas las formas para validar un string las distintas opciones
        //y de esa manera asegurarnos de que estos parametros tengan contenido y sobretodo
        // cuando son string que se envian como parametros del usuario ya que este podria
        // no llenar bien los formularios que se le envian , ya se enviar espacios en blancos, etc.
    }
}
