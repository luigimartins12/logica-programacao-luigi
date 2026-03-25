package aula;

import java.util.Scanner;

public class cadastro {
public static void main(String[] args) {
  Scanner leitor = new Scanner(System.in);
  int nascimento, idade2026, idade2050;
  String nome;
  System.out.println("Digite seu nome");
  nome = leitor.nextLine();

  System.out.println("Digite seu ano de nascimento:");
  nascimento = leitor.nextInt();
  idade2026 = 2026 - nascimento;
  idade2050 = 2050 - nascimento;

  System.out.println(nome +" sua idade em 2026 é "+ idade2026);
  System.out.println(nome +" sua idade em 2050 é "+ idade2050);
  leitor.close();
    }
}
