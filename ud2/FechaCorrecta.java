package ud2;

import java.util.Scanner;

/**@author ASS */
public class FechaCorrecta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce una fecha:");
        int dia = sc.nextInt( );
        int mes = sc.nextInt(); // month
        int ano = sc.nextInt(); // year
        sc.close();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (dia >=1 && dia <= 31) {
                    System.out.printf("La fecha %2d %2d %4d es correcta", dia, mes , ano);
                } else {
                    System.out.printf("La fecha %2d %2d %4d es incorrecta", dia, mes , ano);
                }
                break;
            case 4, 6, 9, 11:
                if (dia >=1 && dia <= 30) {
                    System.out.printf("La fecha %2d %2d %4d es correcta", dia, mes , ano);
                } else {
                    System.out.printf("La fecha %2d %2d %4d es incorrecta", dia, mes , ano);
                }
                break;
            case 2;
                if (dia >=1 && dia <= 28) {
                    System.out.printf("La fecha %2d %2d %4d es correcta", dia, mes , ano);
                break;
            default:
                System.out.printf("La fecha %2d %2d %4d tiene un valor de mes o dia inválido", dia, mes, ano);
        }
    }
}
