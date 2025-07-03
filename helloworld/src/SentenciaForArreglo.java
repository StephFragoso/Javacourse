import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        //String[]nombres= new String[6]; esto es un ejemplo con indice

        String[] nombres = {"Steph", "Nicole", "Gael", "Pepe", "Emma", "Maty", "Aria", "Anya"};

        int count = nombres.length;
       for (int i = 0; i < count; i++){
          // for (int i = 0; i < count-2; i++){ ejemplo de jugar con la longitud de un array, restando a la longitud total
           if (nombres[i].equalsIgnoreCase("Steph")||           //ejemplo con if sobre no querer mostrar dos nombres, se uso el equalsIgnoraCase para que no importe si es mayuscula o minuscula. con el contains.toLowerCase tmbn se puede
                            nombres[i].equalsIgnoreCase("Anya")){
               continue;
           }
           System.out.println( i + ".-"+ nombres[i]);//ejemplo con numero de lista .
           //System.out.println(nombres[i]); ejemplo de imprimir solo la lista
        }
        String buscar= JOptionPane.showInputDialog("Ingrese un nombre");
        System.out.println("buscar = " + buscar);

        //ejemplo de como buscar con un nombre , que te salga la cajita y te diga si se encontro o no
        boolean encontrado = false;
        for (int i=0; i< count;i++){
            if( nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null,  "El nombre fue encontrado");
        }else{
            JOptionPane.showMessageDialog(null,  "El nombre no fue encontrado");
        }
    }

    }

