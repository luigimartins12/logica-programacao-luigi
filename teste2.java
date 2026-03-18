import java.util.Scanner;

public class teste2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite o 1");
        String palavra1 = leitor.nextLine();
        System.out.println("digite o 2");
        String palavra2 = leitor.nextLine();
        System.out.println("digite o 3");
        String palavra3 = leitor.nextLine();
        System.out.println(palavra1 + " " + palavra2 + " " + palavra3);
        leitor.close();
    }
}
