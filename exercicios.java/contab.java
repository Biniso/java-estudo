import java.util.Scanner;

public class contab {

    String titular;
    int numero;
    double saldo;

    

    double depositar(double valor){
        saldo = saldo + valor;
        return saldo;
    }

    double sacar(double valor){
        saldo = saldo - valor;
        return saldo;
    }

    void mostrarSaldo(){
        System.out.println("Titular: " + titular + "\nNumero: " + numero + "\nSeu saldo é: R$" + saldo);
    }

    public contab(String titular, int numero){
        this.titular = titular;
        this.numero = numero;
    }

    public static void main(String[] args) {
        int num;
        double valor;
        String titular;
        int numero;
        

        Scanner read = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        titular = read.nextLine();

        System.out.print("Digite seu numero: ");
        numero = read.nextInt();

        contab conta = new contab(titular, numero);

        System.out.println("Digite 1-Depositar, 2-Sacar, 3-Ver saldo");
        num = read.nextInt();

        switch (num) {
            case 1:
                System.out.print("Digite o valor do deposito: ");
                valor = read.nextDouble();
                conta.depositar(valor);
                break;

            case 2:
                System.out.print("Digite o valor do saque: ");
                valor = read.nextDouble();
                conta.sacar(valor);
                break;

            case 3:
                conta.mostrarSaldo();
                break;
        
            default:
                break;
        }

        conta.mostrarSaldo();

        read.close();
        
    }
}
