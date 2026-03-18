import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        String nome = leitor.nextLine();
        System.out.println("Qual é a sua idade?");
        int idade = leitor.nextInt();
        System.out.println("Qual é a sua altura?");
        double altura = leitor.nextDouble();
        System.out.println("Qual o seu peso?");
        double peso = leitor.nextDouble();

        double imc = peso/(altura*altura);
        System.out.println("\n***DADOS DO USUÁRIO***");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + "kgs");
        System.out.println("IMC: " + imc);
        leitor.close();
    }
}
