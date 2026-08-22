package aulas;

public class Main {
    public static void main(String[] args) {
        carro carro1 = new carro();
        carro1.marca = "Fiat";
        carro1.modelo = "Uno";
        carro1.cor = "Vermelho";
        carro1.velocidade = 0;
        carro1.ano = 2014;
        carro1.combustivel = "Flex";
        carro1.ligado = false;


        System.out.println ("Estado Inicial: ");
        carro1.mostrarDados();

        System.out.println("Acelerando...");
        carro1.acelerar();

        System.out.println("Ligando o carro...");
        carro1.ligar();

        System.out.println("Acelerando...");
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.mostrarDados();

        System.out.println("Um carro entrou na sua frente do nada!");
        carro1.buzinar(); 

        System.out.println ("Freando ...");
        carro1.frear();
        carro1.mostrarDados();

        System.out.println("Você chegou ao seu destino!");
        System.out.println("Desligando carro...");
        carro1.desligar();
    }
}
