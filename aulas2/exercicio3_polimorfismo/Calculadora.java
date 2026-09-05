package aulas2.exercicio3_polimorfismo;

public class Calculadora {
    
    public int somar(int a, int b) {
        int resu = a + b;
        System.out.println(resu);
        return resu;
    }

    public double somar(double a, double b) {
        double resu = a + b;
        System.out.println(resu);
        return resu;
    }

    public int somar(int a, int b, int c) {
        int resu = a + b + c;
        System.out.println(resu);
        return resu;
    }
}
