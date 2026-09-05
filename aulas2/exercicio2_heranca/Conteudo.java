package aulas2.exercicio2_heranca;

public class Conteudo {
    String titulo;
    int duracaoMinutos;

    public Conteudo (String titulo, int duracaoMinutos) {
        this.titulo = titulo;
        this.duracaoMinutos = duracaoMinutos;
    }

    public void exibirResumo() {
        System.out.println("Titulo: " +  titulo);
        System.out.println("Duração: " + duracaoMinutos + " minutos");
    }

}
