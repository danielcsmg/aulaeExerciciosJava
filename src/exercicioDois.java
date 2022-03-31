import java.util.Scanner;

public class exercicioDois {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu endereço: ");
        String endereco = leitor.nextLine();

        System.out.println("O pacote para o seu produto será enviado para" + endereco + ".");
        leitor.close();
    }
}
