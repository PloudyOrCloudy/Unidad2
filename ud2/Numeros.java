package ud2;

import java.util.Scanner;

/**@author Aiko Serrano  */
public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número (use 0 para terminar la ejecución): ");
        int num = sc.nextInt();
        while (num != 0) {
            String par = num % 2 == 0 ? " Es Par" : " Es Impar";
            String signo = num < 0 ? " Es negativo" : " Es positivo";
            double cuadrado = Math.pow(num, 2);
            System.out.println("El número introducido" + par + signo + " " + cuadrado);
        }
        sc.close();
    }
}
