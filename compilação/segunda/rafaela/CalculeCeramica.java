package rafaela;
import java.util.Scanner;
public class CalculeCeramica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double largura, comprimento, area, valor, ceramica;

        System.out.println("informe a lagura e em seguida comprimento para a area da ceramica:");
        largura = input.nextDouble();
        comprimento = input.nextDouble();

        area = ((largura*comprimento)*0.10)+(largura*comprimento);
        System.out.println("A Area com 10% de acabamento a mais é:"+area);
        
        System.out.println("informe o valor da ceramica:");
        ceramica =input.nextDouble();

        valor = area*ceramica;
        System.out.println("O valor é:"+ valor);

        input.close();
    }
    
}
