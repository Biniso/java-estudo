import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        
        int n1, n2, soma, sub, multi, num;
        double div;

        Scanner read = new Scanner(System.in);

        System.out.print("DIgite o primeiro numero: ");
        n1 = read.nextInt();

        System.out.print("Digite o segundo numero: ");
        n2 = read.nextInt();

        System.out.println("Escolha: 1-Soma, 2-Subtracao, 3-Multiplicacao, 4-Divisao");
        num = read.nextInt();

        switch (num) {
            case 1:
                soma = n1 + n2;
                System.out.println("A soma é: " + soma);
                break;
            
            case 2:
                sub = n1 - n2;
                System.out.println("A subtracao é: " + sub);
                break;
        
            case 3:
                multi = n1 * n2;
                System.out.println("A multiplicacao é: " + multi);
                break;
        
            case 4:
                div = n1 + n2;
                System.out.println("A divisao é: " + div);
                break;
        
            default:
                System.out.println("Falha");
                break;
        }
        read.close();
    }
}
