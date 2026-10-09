package ud2;

import java.util.Scanner;

public class TrianguloAsteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cuantos elementos quieres que sea uno de los lados: ");
        int lado = sc.nextInt();
        do { 
            System.out.print("*");
            int contador = 1;
            while (contador == lado) {
                System.err.println("*");
            }
            lado--;
        } while (true);
    }
}