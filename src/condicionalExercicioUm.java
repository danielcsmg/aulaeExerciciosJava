import java.util.Scanner;

public class condicionalExercicioUm {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float nota1, nota2, nota3, nota4;

        System.out.println("Digite a primeira nota:");
        nota1 = leitor.nextFloat();
        System.out.println("Digite a segunda nota:");
        nota2 = leitor.nextFloat();
        System.out.println("Digite a terceira nota:");
        nota3 = leitor.nextFloat();
        System.out.println("Digite a quarta nota:");
        nota4 = leitor.nextFloat();
        
        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("Parabéns, você passou!!!");
        }else{
            System.out.println("Que pena. Você não passou.");
        }
        
        leitor.close();
    }
}