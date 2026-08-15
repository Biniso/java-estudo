public class aluno {

    String nome;
    double nota1, nota2;

    double calcularMedia(){
        double media = (nota1 + nota2)/2;
        return media;
    }

    void mostrarDados(){
        System.out.println("Nome: " + nome + "\nPrimeira nota: " + nota1 + "\nSegunda nota: " + nota2 + "\nMédia final: " + calcularMedia());
    }

    public aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public static void main(String[] args) {
        aluno aluno1 = new aluno("Lucas", 7.5, 8.5);

        aluno1.mostrarDados();
    }
}
