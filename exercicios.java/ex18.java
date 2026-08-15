import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        
        String nome;
        String[] nomes;

        Scanner read = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = read.nextLine();

        nomes = nome.split(" ");

        System.out.println("Primeiras iniciais: " + nomes[0].charAt(0) + nomes[nomes.length-1].charAt(0));
    }
}
