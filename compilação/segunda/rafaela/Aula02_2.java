package rafaela;
import java.util.Scanner;
public class Aula02_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("1 a 7");
         int dia = ler.nextInt();

         switch (dia) {
            case 1:
                System.out.println("segunda");
                break;
            case 2:
                System.out.println("terça");
                break;
            case 3:
                System.out.println("quarta");
                break;
            case 4:
                System.out.println("quinta");
                break;
            case 5:
                System.out.println("sexta");
                break;
            case 6:
                System.out.println("sabado");
                break;
         
            default:
                break;
         }
         ler.close();
    }
}
