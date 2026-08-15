import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        
        int km, l;
        double consumo;

        Scanner read = new Scanner(System.in);

        System.out.print("Digite a distancia percorrida: ");
        km = read.nextInt();

        System.out.print("Digite a quantidade de combustivel consumida: ");
        l = read.nextInt();

        consumo = km/l;

        System.out.printf("\nO consumo medio é de %.2f km/l\n", consumo);
    }
}
