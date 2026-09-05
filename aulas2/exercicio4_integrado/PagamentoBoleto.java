package aulas2.exercicio4_integrado;

public class PagamentoBoleto extends Pagamento{
    
    public PagamentoBoleto(double valor){
        super(valor);
    }

    @Override
    public double calcularTaxa(){
        return 2.50;
    }

    @Override
    public void processar(){
        System.out.println("Pagamento no boleto");
        System.out.println("Taxa: R$" + calcularTaxa());
        System.out.println("Total: R$" + calcularTotal());
    }
}
