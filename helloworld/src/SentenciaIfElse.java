import java.util.Arrays;

public class SentenciaIfElse {
    public static void main(String[] args) {
        float promedio= 4.5f;


        if(promedio >=6.5) {
            System.out.println("Felicidades!,buen promedio");

        } else if (promedio >=6.0) {
            System.out.println("Muy buen promedio");
        
        } else if (promedio >=5.5) {
            System.out.println("Buen promedio");

        } else if (promedio >=5.0) {
            System.out.println("Regular,necesitas mejorar");

        } else if (promedio >=4.0) {
            System.out.println("Insuficiente,necesitas mas horas de estudio");

        }else {
            System.out.println("Reprobado");
            
        }

        System.out.println("Tu promedio es " + promedio);
        

        // }else{
        //    System.out.println("Necesitas mejorar un poco mas");
        



    }
}
