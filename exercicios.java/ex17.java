import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        
        String nome;

        Scanner read = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = read.nextLine();

        System.out.println("nome:"+ nome);
        System.out.println("nome maiusculo: "+ nome.toUpperCase());
        System.out.println("quantidade de letras: "+ nome.length());
    }
}
