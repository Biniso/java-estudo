package aulas2.exercicio1_encapsulamento;

public class Cofrinho {
    private String objetivo;
    private double saldo;

    public Cofrinho (String objetivo){
        this.objetivo = objetivo;
        this.saldo = 0;
    }

    public void setObjetivo(String texto) {
        objetivo = texto;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public double getSaldo() {
        return saldo;
    }

    void depositar(double valor) {
        if (valor < 0 ) {
            System.out.println("Não é possivel depositar um valor negativo");
        }else {
            saldo += valor;
            System.out.println("Saldo: " + getSaldo());
        }
    }

    void retirar(double valor) {
        if (valor < 0 || valor > saldo) {
            System.out.println("Não é possivel retirar esse valor");
        }else {
            saldo -= valor;
            System.out.println("Saldo: " + getSaldo());
        }
    }

    void mostrarResumo() {
        System.out.println("Objetivo: " + getObjetivo());
        System.out.println("Saldo: " + getSaldo());
    }

}
