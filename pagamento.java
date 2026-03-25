package aula;

import java.util.Scanner;

public class pagamento {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double pagamento, bonus, multa;

        System.out.println("Você possui duas possibilidades para o pagamento do boleto.");
        System.out.println("Digite o valor do pagamento:");
        pagamento = leitor.nextDouble();

        bonus = pagamento - (pagamento * 0.10);
        multa = pagamento + (pagamento * 0.05);

        System.out.println("Se pagar antecipado, o valor será: "+ bonus);
        System.out.println("Se pagar atrasado, o valor será: "+ multa);
        leitor.close();
    }
}
