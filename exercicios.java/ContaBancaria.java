import java.util.Scanner;

public class ContaBancaria {
    String titular;
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
        System.out.println("Titular: " + titular + "\nSaldo: R$" + saldo);
    }

    public ContaBancaria(String titular){
        this.titular = titular;
    }

    public static void main(String[] args) {
        int num;
        double valor;

        

        Scanner read = new Scanner(System.in);


        ContaBancaria conta1 = new ContaBancaria("Arthur");
        ContaBancaria conta2 = new ContaBancaria("Vitor");

        System.out.println("Digite 1-Conta Arthur 1, 2-Conta Vitor 2");
        num = read.nextInt();

        switch (num) {
            case 1:
                System.out.println("Digite 1-Depositar, 2-Sacar, 3-Ver saldo");
                num = read.nextInt();

                switch (num) {
                    case 1:
                        System.out.print("Digite o valor do deposito: ");
                        valor = read.nextDouble();
                        conta1.depositar(valor);
                        break;

                    case 2:
                        System.out.print("Digite o valor do saque: ");
                        valor = read.nextDouble();
                        conta1.sacar(valor);
                        break;

                
                    default:
                        break;
                }
                break;
            
            case 2:
                System.out.println("Digite 1-Depositar, 2-Sacar, 3-Ver saldo");
                num = read.nextInt();

                switch (num) {
                    case 1:
                        System.out.print("Digite o valor do deposito: ");
                        valor = read.nextDouble();
                        conta2.depositar(valor);
                        break;

                    case 2:
                        System.out.print("Digite o valor do saque: ");
                        valor = read.nextDouble();
                        conta2.sacar(valor);
                        break;

                
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        
        conta1.mostrarSaldo();
        conta2.mostrarSaldo();

        read.close();
        
    }
}
