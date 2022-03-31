import java.util.Scanner;

public class exercicioUm {
    public static void main(String[] args) {
        System.out.println("Digite seu nome: ");
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();

        System.out.println("Olá, " + nome + ", sua idade é " + idade + " anos.");
        leitor.close();
    }
}
