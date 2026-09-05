

public class produto {

    private String nome;
    private double preco;
    private int quanti;


    double calcularValorEstoque() {
        double resul = preco * quanti;
        return resul;
    }

    void mostrarDados() {

        System.out.println("Nome: " + nome + "\nPreço: R$" + preco + "\nQuantidade: " + quanti + "\nValor do estoque: R$" + calcularValorEstoque());
    }

    public String getnome() {
        return nome;
    }

    public double getpreco() {
        return preco;
    }

    public int getquanti() {
        return quanti;
    }

    public void setpreco(double preco){
        if (preco > 0){
            System.out.println("O preco nao pode ser negativo!");
        }
    }

    public produto(String nome, double preco, int quanti){
        this.nome = nome;
        this.preco = preco;
        this.quanti = quanti;
    }

    public static void main(String[] args) {

        
        produto prod1 = new produto("Arroz", 10.50, 5 );
        produto prod2 = new produto("Feijao", 12.90, 8 );

        System.out.println("Nome: " + prod1.getnome() + "\nPreço: R$" + prod1.getpreco() + "\nQuantidade: " + prod1.getquanti());
        prod2.mostrarDados();
    }
}
