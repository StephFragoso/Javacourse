public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {

        String archivo= "alguna_imagen.jpeg";
        int i= archivo.indexOf(".");//es mejor usar lastindexof es decir la ultima ocurrencia para evitar errores

        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(14) = " + archivo.substring(14));
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length()-4));
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(i+1));




    }
}
