public class PrecedenciaOperadores {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        double promedio = (i +j +k )/3;//usar parentesis para dar prioridad, ya que si no se hace el programa va a seguir la precedencia es decir la prioridad segun la tabla , ver imagen o cuaderno
        System.out.println("promedio = " + promedio);

        promedio = i +j +k / 3d * 10;//aqui primero divide y es 6.6 luego multiplica por 10 y es 66.6 a esto se le suma la i + la j  , el resultado es 88.6
        System.out.println("promedio = " + promedio);

   //     promedio = i +j +k /( 3d * 10);//aqui el resultado seria 22.6 porque cambia primero suma i+j+ k que se divide entre 30 el resultado de la multiplicacion dentro de los patentesis
// la d en el 3d es para especificar que es un double
//     promedio =( i +j +k) / 3d * 10;//aqui el resultado seria 140.0


//  el pre o post  incremento va a tener prioridad
        promedio = ++i +j-- +k / 3d * 10;// (15+8) + 66.6 = 89.6
        System.out.println("promedio = " + promedio);
        System.out.println("i = " + i);//es un pre incremento
        System.out.println("j = " + j);//es un post decremento


  //     promedio = --i + j++ +k / 3d * 10;// (13+8) + 66.6 = 87.6
    }
}
