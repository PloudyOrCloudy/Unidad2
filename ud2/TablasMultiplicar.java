package ud2;

public class TablasMultiplicar {
    public static void main(String[] args) {
        int num1 = 1;
        do { 
            int num2 = 1;
            while (num2 <= 10) {
                System.out.printf("La multiplicación de %d y %d es: %d \n", num1, num2, num1*(num2++));
            }
            num1++;
        } while (num1 <= 10);
    }
}
