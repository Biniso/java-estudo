import java.util.Scanner;

public class ex3 {
    public static void main (String[] args) {

        String nome, curso, turma;
        Scanner read = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = read.nextLine();

        System.out.print("Digite seu curso: ");
        curso = read.nextLine();

        System.out.print("Digite seu turma: ");
        turma = read.nextLine();

        System.out.printf("\nFicha de %s \nCurso: %s\nTurma: %s\n\n",nome,curso,turma);

        read.close();

    }
}
