import java.util.Scanner;

public class condicionalExercicioCinco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Algoritmo que calcula o maior número");
        System.out.println("Digite o primeiro número:");
        double numero1 = leitor.nextDouble();
       
        System.out.println("Digite o segundo número:");
        double numero2 = leitor.nextDouble();

        if(numero1 >= numero2){
            System.out.println(numero1);
        }else{
            System.out.println(numero2);
        }
        
        leitor.close();
    }
}
