package ud2;

public class SumarImpares {
    public static void main (String[] args){
        int impares = 0;
        int contador = 1;
        do {         
            if (contador % 2 != 0) {
                System.out.println(contador);
                impares++;
            }
            contador++;
        } while (impares <= 10);
        System.err.println("Aqui los 10 primeros números impares, hasta otra!");
    }
}
