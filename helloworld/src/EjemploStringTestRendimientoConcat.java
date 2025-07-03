public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb= new StringBuilder(a); //este string es mutable y mas eficiente, rapido
        long inicio = System.currentTimeMillis();


        for (int i = 0; i < 500; i++ ){

             //ejemplo1  c = c.concat(a).concat(b).concat("\n");//500 => 3ms
           // ejemplo2   c += a+b+"\n";//500 25ms aqui el c+ = es lo mismo que decir c = c +a+b+"\n";
            sb.append(a);//500 0ms ejemplo3
           sb.append(b);//el append retorna el objeto sb , la misma instancia
           sb.append("\n"); //parte del ejemplo3


        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = "+ c);
        System.out.println("sb = " + sb.toString());//aqui con el tostring le estoy diciendo que genere el string completo

    }
}
