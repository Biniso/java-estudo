import java.util.Scanner;

public class circulo {

    double raio;

    double calcularArea(){
        return Math.PI * raio * raio;
    }

    double calcularCircunferencia(){
        return  2 * Math.PI * raio;
    }


    public circulo(double raio){
        this.raio = raio;
    }
    public static void main(String[] args) {

        double raio;
        int num;

        Scanner read = new Scanner(System.in);

        System.out.println("Digite o raio: ");
        raio = read.nextDouble();

        System.out.println("Digite 1-Calcular area, 2-Calcular circunferencia");
        num = read.nextInt();

        circulo resul = new circulo(raio);

        switch (num) {
            case 1:
                System.out.println("Raio: " + raio + "\nArea: " + resul.calcularArea());
                break;

            case 2:
                System.out.println("Raio: " + raio + "\nCircunferencia: " + resul.calcularCircunferencia());
                break;
        
            default:
                break;
        }
        read.close();
        
    }
}
