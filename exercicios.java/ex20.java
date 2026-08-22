import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
         String word;
        

         Scanner read = new Scanner(System.in);

         System.out.print("Digite um palavra: ");
         word = read.nextLine();

         

         System.out.print(word.charAt(0));
         System.out.println(word.charAt(word.length()-1));

         read.close();
    }
}
