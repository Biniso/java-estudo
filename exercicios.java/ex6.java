import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        
        String nome;
        int idade;

        Scanner read = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = read.nextLine();

        System.out.print("\nDigite sua idade: ");
        idade = read.nextInt();

        System.out.printf("\n%s possui %d anos", nome, idade);

        read.close();

    }
}
