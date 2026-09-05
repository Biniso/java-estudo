package aulas2.exercicio3_polimorfismo;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somar(10, 20);
        calculadora.somar(2.5, 3.8);
        calculadora.somar(1, 2, 3);
    }
}
