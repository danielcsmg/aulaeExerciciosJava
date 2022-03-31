import java.util.Scanner;

public class exercicioTres {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu saldo: ");
        int saldo = leitor.nextInt();

        System.out.println("O saldo atual da sua conta é de: R$" + saldo + ".");
        leitor.close();
    }
}
