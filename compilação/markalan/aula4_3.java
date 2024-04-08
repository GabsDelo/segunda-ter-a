package markalan;
import java.util.Scanner;
public class aula4_3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float A, B, C;
        System.out.println("digite os lados do triangulo");

        A = ler.nextFloat();
        B = ler.nextFloat();
        C = ler.nextFloat();

        if (((A+B)>C) && ((B+C)>A) && ((A+C)>B)){
            System.out.println("forma o triangulo");
        } else {
            System.out.println("não forma o triangulo");
        }
        ler.close();
    }
    
}
