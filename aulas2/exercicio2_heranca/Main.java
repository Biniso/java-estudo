package aulas2.exercicio2_heranca;

public class Main {
    public static void main(String[] args) {
        Podcast podcast = new Podcast("Podepá", 20, "Mítico");
        VideoAula videoaula = new VideoAula("Java POO", 67, "YouTube");

        podcast.mostrar();
        videoaula.mostrar();

        videoaula.reproduzirVideo();
        podcast.ouvirAudio();
    }
}
