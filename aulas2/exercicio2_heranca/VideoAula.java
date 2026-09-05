package aulas2.exercicio2_heranca;

public class VideoAula extends Conteudo{
    String plataforma;

    public VideoAula(String titulo, int duracaoMinutos, String plataforma) {
        super(titulo, duracaoMinutos);
        this.plataforma = plataforma;
    }

    public void reproduzirVideo() {
        System.out.println("Reproduzindo videoaula...");
    }
    
    public void mostrar(){
        exibirResumo();
        System.out.println("Plataforma: " + plataforma);
        System.out.println();
    }
}
