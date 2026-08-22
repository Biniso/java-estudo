import java.util.Scanner;

public class lampada {

    String cor;
    boolean estado;

    void ligar(){
        estado = true;
    }

    void desligar(){
        estado = false;
    }

    void mostrarEstado(){
        if(estado == true){
            System.out.println("Luz " + cor + " ligada.");
        } else{
            System.out.println("Luz " + cor + " desligada.");
        }
        
    }

    public lampada(String cor){
        this.cor = cor;
    }

    public static void main(String[] args) {

        String cor;
        int num;

        Scanner read = new Scanner(System.in);

        System.out.print("Digite a cor da lampada: ");
        cor = read.nextLine();

        System.out.print("Digite 1-Ligar luz, 2-Desligar luz, 3-Mostrar estado");
        num = read.nextInt();

        lampada luz = new lampada(cor);

        switch (num) {
            case 1:
                luz.ligar();
                break;

            case 2:
                luz.desligar();
                break;

            case 3:
                luz.mostrarEstado();
                break;
        
            default:
                break;
        }
        if(num != 3){
            luz.mostrarEstado();
        }

        read.close();
        
    }
}
