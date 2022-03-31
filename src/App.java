import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String nome;

        System.out.println("Digite um nome: ");
        nome = leitor.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();

        System.out.println("Olá, " + nome + " sua idade é " + idade + " anos.");
        leitor.close();
    }
}
