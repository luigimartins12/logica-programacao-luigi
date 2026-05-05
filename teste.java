package teste;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("=== RPG: BOSS ESPECIAL ===");
        System.out.println("Um BOSS raro pode surgir se certas condições forem atendidas!\n");
        System.out.println("1 - O jogador deve estar na área em que o BOSS surge");
        System.out.println("2 - O jogador deve estar pelo menos no nível de personagem 50");
        System.out.println("3 - O jogador deve estar com 50% da vida ou menos\n");

        System.out.println("MARQUE CONDIÇÕES\n");

        System.out.println("O jogador está na área do BOSS? (s para sim, n para não)");
        String area = leitor.nextLine();

        System.out.println("Em que nível o personagem do jogador está?");
        int nivel = leitor.nextInt();

        System.out.println("Qual é a porcentagem da vida atual do jogador?");
        double vida = leitor.nextDouble();

        if (area.equalsIgnoreCase("s") && nivel >= 50 && vida <= 50) {
            System.out.println("\n=== O INIMIGO ESPECIAL SURGIU! ===");
        } else {
            System.out.println("\n=== Nada acontece... ===");
        }
        leitor.close();
    }
}
