package aula;

import java.util.Scanner;

public class valor {
public static void main(String[] args) {
 Scanner leitor = new Scanner(System.in);
 int valor, sucessor, antecessor, dobro;
 System.out.println("Digite o valor:");
 valor = leitor.nextInt();
 sucessor = valor + 1;
 antecessor = valor -1;
 dobro = valor * 2;
 System.out.println("Sucessor: "+ sucessor);
 System.out.println("Antecessor: "+ antecessor);
 System.out.println("Dobro: "+ dobro);
 leitor.close(); 
 }
}