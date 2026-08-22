import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        
        double n1, n2, n3, med;

        Scanner read = new Scanner(System.in);

        System.out.println("\nDigite a primeira nota: ");
        n1 = read.nextDouble();

        System.out.println("\nDigite a segunda nota: ");
        n2 = read.nextDouble();

        System.out.println("\nDigite a terceira nota: ");
        n3 = read.nextDouble();

        med = (n1 + n2 + n3)/3;

        System.out.printf("\nA media é %.2f\n", med);

        read.close();
    }
}
