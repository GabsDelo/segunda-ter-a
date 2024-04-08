package rafaela;
import java.util.Scanner;
public class gasolina {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double preçoG, PreçoET;
        System.out.println("informe o preço");
        preçoG=input.nextDouble();
        
        System.out.println("informe o preço");
        PreçoET=input.nextDouble();

        if (PreçoET< preçoG*0.7) {
            System.out.println("vale a pena usar o etanol");
            
        }else{
            System.out.println("vale a pena abastecer na gasolina");

        }
        input.close();
    }
}