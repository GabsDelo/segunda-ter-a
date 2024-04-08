package markalan;
import java.util.Scanner;
public class aula4_1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         int a1, a2, a3, soma;

         System.out.println("digite a1:");
         a1=ler.nextInt();

         System.out.println("digite a2:");
         a2=ler.nextInt();

         System.out.println("digite a3:");
         a3=ler.nextInt();

         soma= a1+a2+a3;
         if (soma>=70) {
            System.out.println("Passou!");
         } else {
            System.out.println("Reprovado!");
         }
         ler.close();

    }
    
}
