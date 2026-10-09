package ud2;

import java.util.Scanner;

public class Suspensos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este es un programa que va a leer 5 notas");
        int contador = 1;
        int suspensos = 0;
        do { 
            System.out.println("Escribe la nota %d: ");
            int nota = sc.nextInt();
            if (nota < 5) {
                suspensos++;
            }
        } while (contador <= 5);
        sc.close();
        if ( suspensos < 1) {
            System.out.println("De entre las 5 notas introducidas, nadie suspedio!");
        } else if ( suspensos == 1) {
            System.out.println("De entre las 5 notas introducidas hubo 1 suspenso");
        } else{
            System.out.printf("De entre las 5 notas introducidas hubo %d suspensos", suspensos);
        }
    }
}
