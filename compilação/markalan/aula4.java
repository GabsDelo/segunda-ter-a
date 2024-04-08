package markalan;
import java.util.Scanner;
public class aula4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double resposta1;
        System.out.println("Favor escreva um numero");
        resposta1 = ler.nextDouble();

        if (0>=resposta1){
            System.out.println("valor fora do limite");
        }
        else{
            System.out.println("valor dentro do limite!");
        }
        if (resposta1<=100) {
            System.out.println("valor dentro do padrão");
        } else {
            System.out.println("valor fora do padrão");
        }

        ler.close();
    }
    
}
