package aula;

import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double salario, salarioliquido;

        System.out.println("Digite o seu salário:");
        salario = leitor.nextDouble();
        salarioliquido = salario - (salario * 0.02);

        System.out.println("Seu salário líquido é: "+ salarioliquido);
        leitor.close();
    }
}
