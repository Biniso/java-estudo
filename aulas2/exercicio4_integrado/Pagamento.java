package aulas2.exercicio4_integrado;

public class Pagamento {
    private double valor;

    public Pagamento(double valor) {
        if(valor >= 0) {
            this.valor = valor;
        }
    }

    public double getValor() {
        return valor;
    }

    public double calcularTaxa() {
        return 0;
    }

    public double calcularTotal() {
        return getValor() + calcularTaxa();
    }

    public void processar() {
        System.out.println("Taxa: R$" + calcularTaxa());
        System.out.println("Total: R$" + calcularTotal());
    }
}
