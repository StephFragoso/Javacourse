public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter='@';

        char espacio='6';
        char retroceso='\b';//significa que retrocede un espacio hacia atras elimina un caracter
        char tabulador='\t';//significa que da un espacio mas amplio que el primero
        char nuevaLinea='\n';//significa salto de linea
        char retornoCarro='\r';//es similar al nuevalinea

        System.out.println("Como hacer un salto de linea = " + System.getProperty("line.separator")+ Character.BYTES);
        System.out.println("Como hacer un salto de linea = " + System.lineSeparator()+ Character.BYTES);
        System.out.println("Como hacer un salto de linea =\n2 ");

        System.out.println("caracter = " + caracter);
        System.out.println("char corresponde en byte a" + Character.BYTES);
        System.out.println("char corresponde en bites a" + Character.SIZE);
        System.out.println("Character.MAX_VALUE " +  Character.MAX_VALUE);
        System.out.println(" Character.MIN_VALUE" + Character.MIN_VALUE);


    }
}
