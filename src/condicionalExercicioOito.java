import java.util.Scanner;

public class condicionalExercicioOito {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        float a = leitor.nextFloat();

        System.out.println("Digite o segundo número:");
        float b = leitor.nextFloat();

        System.out.println("Digite o terceiro número:");
        float c = leitor.nextFloat();

        System.out.println("Digite o quarto número:");
        float d = leitor.nextFloat();
        
        System.out.println("Digite o quinto número:");
        float e = leitor.nextFloat();

        System.out.println("Digite o sexto número:");
        float f = leitor.nextFloat();


        if(a == b){
            System.out.println(a + " é igual a " + b);
        }
        
        if(c != d){
            System.out.println(c + " é diferente de " + d);
        }
        
        if(e > f){
            System.out.println(e + " é maior que " + f);
        }

        leitor.close();
    }
}
