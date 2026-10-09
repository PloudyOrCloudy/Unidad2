package ud2;

import java.util.Scanner;

public class DiaDeLaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número del 1 al 7: ");
        int dia = sc.nextInt();

        sc.close();

        switch (dia) {
            case 1:
                System.out.println("El número " + dia +" corresponde a Lunes");
                break;
            case 2:
                System.out.println("El número " + dia +" corresponde a Martes");
                break;
            case 3:
                System.out.println("El número " + dia +" corresponde a Miércoles");
                break;
            case 4:
                System.out.println("El número " + dia +" corresponde a Jueves");
                break;
            case 5:
                System.out.println("El número " + dia + " corresponde a Viernes");
                break;
            case 6:
                System.out.println("El número " + dia +" corresponde a Sábado");
                break;
            case 7:
                System.out.println("El número " + dia +" corresponde a Domingo");
                break;
            default:
                System.out.println("Número inválido. Por favor, introduce un número del 1 al 7.");
        }
    }
}
