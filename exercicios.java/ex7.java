public class ex7 {
    public static void main(String[] args) {
        
        int a = 10, b = 20, aux;

        System.out.printf("A = %d e B = %d", a, b);

        aux = a;
        a = b;
        b = aux;

        System.out.printf("\nA = %d e B = %d\n", a, b);
    }
}
