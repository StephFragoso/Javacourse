public class OperadoresAsignacion {
    public static void main(String[] args) {

        int i=5;//aqui el operador de asignacion es el =
        int j = i+4;

        System.out.println("i= "+i);
        System.out.println("j= "+j);

        i +=2; // esto seria lo mismo pero mas largo  i=i+2;
        System.out.println("i = " + i);

        i +=5;//es lo mismo que i = i +5; aqui da 12 como resultado porque i su valor es 7 por la operacion en la linea anterior, asi que 7+5=12
        System.out.println("i = " + i);

        j -=4;//es lo mismo que j = j -4;
        System.out.println("j = "+j);

        j *=3;//es lo mismo que j = j *3;
        System.out.println("j = "+j);

 // en el siguiente ejemplo se aplica concatenacion compuesta en el string
 // esto permite generar una consulta sql
        String sqlString = "select * from clientes as c";// que busque todos los registros en la tabla clientes  alias c
        sqlString +="where c.nombre= 'Steph'";//se esta agregando la condicion where donde el nombre del cliente sea igual a Steph
        sqlString +="and c.activo=1";//se esta agregando la condicion and donde el cliente este activo
        System.out.println("sqlString = " + sqlString);







    }
}
