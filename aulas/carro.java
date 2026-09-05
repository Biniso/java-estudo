package aulas;

public class carro {
    String marca;
    String modelo;
    String cor;
    String combustivel;
    boolean ligado;
    int ano;
    int velocidade;

    void acelerar(){
        if(ligado == true){
            velocidade = velocidade + 10;
        }else{
            System.out.println(); 
            System.out.println("Precisa ligar o carro antes!");
        }
    }
    void frear(){
        velocidade = velocidade - 10;
    }

    void ligar(){
        ligado = true;
        System.out.println("Carro ligado!");
        System.out.println();
    }

    void desligar(){
        ligado = false;
        System.out.println("Carro desligado!");
        System.out.println();
    }

    void buzinar(){
        System.out.println("BIIIIII BIIIIII!");
        System.out.println();
    }

    public int getvelocidade(){
        return velocidade;
    }

    void mostrarDados(){
        System.out.println(); 
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Combustivel: " + combustivel);
        System.out.println("Velocidade: " + velocidade);
        System.out.println();
    }
}
