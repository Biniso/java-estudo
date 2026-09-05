package aulas2.exercicio2_heranca;

public class Podcast extends Conteudo{
    String apresentador;

    public Podcast(String titulo, int duracaoMinutos, String apresentador) {
        super(titulo, duracaoMinutos);
        this.apresentador = apresentador;
    }
    
    public void ouvirAudio() {
        System.out.println("Ouvindo podcast...");
    }

    public void mostrar(){
        exibirResumo();
        System.out.println("Apresentador: " + apresentador);
        System.out.println();
    }
}
