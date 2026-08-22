import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        
        int C;
        double F;

        Scanner read = new Scanner(System.in);

        System.out.print("\nDigite a temperatura em Celsius: ");
        C = read.nextInt();

        F = C * 9 / 5 + 32;

        System.out.printf("\n%d graus Celsius é %.1f graus Fahrenheit\n", C, F);

        read.close();
    }
}