import java.util.Scanner;

public class condicionalExercicioSeis {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do primeiro time:");
        String time1 = leitor.nextLine();

        System.out.println("Digite a quantidade de gols do primeiro time:");
        int numGols1 = leitor.nextInt();
       
        System.out.println("Digite o nome do segundo time:");
        String time2 = leitor.nextLine();

        System.out.println("Digite a quantidade de gols do segundo time:");
        int numGols2 = leitor.nextInt();

        if(numGols1 > numGols2){
            System.out.println(time1);
        }else if(numGols1 < numGols2){
            System.out.println(time2);
        }else{
            System.out.println("Empate");
        }
        
        leitor.close();
    }
}
