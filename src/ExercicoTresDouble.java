import java.util.Scanner;

public class ExercicoTresDouble {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu saldo: ");
        double saldo = leitor.nextDouble();

        System.out.println("O saldo atual da sua conta é de: R$" + saldo + ".");
        leitor.close();
    }
}
