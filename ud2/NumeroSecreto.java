package ud2;

import java.util.Scanner;

public class NumeroSecreto {

    public static void main(String[] args) {
        int ran = (int) Math.round(Math.random()*99)+1;
        int num = 0;
        int a = 0;
        Scanner sc = new Scanner(System.in);
        while ( num != ran ) {
            System.out.println("Para rendirte escribe ' -1 ': ");
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
            if (num == -1) {
                a = 1;
                break;
            }
            if (num < 1 || num > 100) {
                System.out.println("El número introducido no está en el rango");
            }
            if (num < ran) {
                System.out.println("El número secreto es mayor al introducido");
            } else if (num > ran) {
                System.out.println("El número secreto es menor al introducido");
            }
        }
        sc.close();
        if (a == 1) {
            System.out.println("Mala suerte, perdiste, el número era " + ran);
        } else {
        System.out.println("Felicidades! Acertaste el número");
        }
    }
}
