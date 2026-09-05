package aulas2.exercicio4_integrado;

public class PagamentoPix extends Pagamento{
    
    public PagamentoPix(double valor){
        super(valor);
    }

    @Override
    public double calcularTaxa() {
        return 0;
    }

    @Override
    public void processar() {
        System.out.println("Pagamento no Pix");
        System.out.println("Taxa: R$" + calcularTaxa());
        System.out.println("Total: R$" + calcularTotal());
    }
}
