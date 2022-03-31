import java.util.Scanner;

public class condicionalExercicioDois {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu peso:");
        float peso = leitor.nextFloat();
        System.out.println("Digite sua altura:");
        float altura = leitor.nextFloat();

        float imc = peso / (altura * altura);

        if(imc <= 18.5){
            System.out.println("Magreza");
        }else if(imc <= 25){
            System.out.println("Peso normal");
        }else if(imc <= 30){
            System.out.println("Sobrepeso");
        }else if(imc <= 40){
            System.out.println("Obesidade");
        }else{
            System.out.println("Obesidade grave");
        }

        leitor.close();
    }
}
