import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        
        int sec, h, min, temp;

        Scanner read = new Scanner(System.in);

        System.out.print("Digite os segundos: ");
        temp = read.nextInt();

        h = temp/3600;
        min = (temp%3600)/60;
        sec = (temp%3600)%60;

        System.out.printf("\nRestam %d horas, %d minutos e %d segundos\n", h, min, sec);

        read.close();

    }
}
