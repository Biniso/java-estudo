

public class produto {

    String nome;
    double preco;
    int quanti;


    double calcularValorEstoque() {

        double resul = preco * quanti;
        return resul;
    }

    void mostrarDados() {

        System.out.println("Nome: " + nome + "\nPreço: R$" + preco + "\nQuantidade: " + quanti + "\nValor do estoque: R$" + calcularValorEstoque());
    }

    public produto(String nome, double preco, int quanti){
        this.nome = nome;
        this.preco = preco;
        this.quanti = quanti;
    }

    public static void main(String[] args) {
        
        produto prod1 = new produto("Arroz", 10.50, 5 );
        produto prod2 = new produto("Feijao", 12.90, 8 );

        prod1.mostrarDados();
        prod2.mostrarDados();
    }
}
