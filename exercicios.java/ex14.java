import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        
        int preco, valor, troco;

        Scanner read = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        preco = read.nextInt();

        System.out.print("Digite o valor pago: ");
        valor = read.nextInt();

        troco = valor - preco;

        System.out.printf("\nO troco é R$%d\n", troco);

    }
}
