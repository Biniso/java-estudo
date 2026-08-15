public class cachorro {

    String nome;
    int idade;

    void latir(){
        System.out.println("-AU AU");
    }

    public static void main(String[] args) {

        cachorro dog = new cachorro();

        dog.nome = "Agenor";
        dog.idade = 8;

        System.out.println("\n-Esse é o " + dog.nome + " e ele tem " + dog.idade + " anos.");
        System.out.println("-Da oi " + dog.nome + ":");
        dog.latir();
    }
}
