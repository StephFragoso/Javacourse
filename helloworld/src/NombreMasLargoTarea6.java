import javax.swing.*;
import java.util.Scanner;

public class NombreMasLargoTarea6 {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Hola! ingresa nombre y apellido, por favor");
//        Thread.sleep(1000);

        String nombre1 = JOptionPane.showInputDialog("Ingresa el primer nombre");
        String nombre2 = JOptionPane.showInputDialog("Ingresa el segundo nombre");
        String nombre3 = JOptionPane.showInputDialog("Ingresa el tercer nombre");


        int longNombre1 = nombre1.length();
        int longNombre2 = nombre2.length();
        int longNombre3 = nombre3.length();

        if (longNombre1 > longNombre2 & longNombre1 > longNombre3) {
            JOptionPane.showMessageDialog(null,"el nombre mas largo es " + nombre1);
        } else if (longNombre2 > longNombre1 & longNombre2 > longNombre3) {
            JOptionPane.showMessageDialog(null,"el nombre mas largo es " + nombre2);
        } else {
            JOptionPane.showMessageDialog(null,"el nombre mas largo es " + nombre3);
        }



    }
}
