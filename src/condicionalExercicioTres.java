import java.util.Scanner;

public class condicionalExercicioTres {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        double numero = leitor.nextDouble();

        if(numero < 10){
            System.out.println("É menor que dez.");
        }else{
            System.out.println("Não é maior que dez.");
        }

        leitor.close();
    }
}
