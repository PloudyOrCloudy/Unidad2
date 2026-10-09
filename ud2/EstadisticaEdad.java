package ud2;

import java.util.Scanner;

/**
 * @author ASS
 */
public class EstadisticaEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dato = sc.nextInt();
        int suma = 0;
        int contador = 0;
        int mayor = 0;
        double med = 0;
        while (dato >= 0) {
            contador = contador + 1;
            suma = dato + suma;
            med = (double) suma / contador;
            if (dato >= 18) {
                mayor = mayor + 1;
            }
            dato = sc.nextInt();
        }
        System.out.println("Basado en los datos introducidos hay " + contador + " alumnos con " + mayor + " mayores de edad y una media de " + med + " de edad y " + suma + " sumando todas las edades");
    }
}
