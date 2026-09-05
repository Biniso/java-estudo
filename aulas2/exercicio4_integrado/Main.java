package aulas2.exercicio4_integrado;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamentopix = new PagamentoPix(100);
        Pagamento pagamentocartao = new PagamentoCartao(200, 4);
        Pagamento pagamentoboleto = new PagamentoBoleto(100);

        pagamentopix.processar();
        System.out.println();
        pagamentocartao.processar();
        System.out.println();
        pagamentoboleto.processar();
    }
}
