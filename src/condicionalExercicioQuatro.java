import java.util.Scanner;

public class condicionalExercicioQuatro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Algoritmo que calcula área de um retângulo");
        System.out.println("Digite a largura:");
        double largura = leitor.nextDouble();
       
        System.out.println("Digite a altura:");
        double altura = leitor.nextDouble();

        double area = largura * altura;
        System.out.println("A área do retângulo é: " + area + ".");
        leitor.close();
    }
}
