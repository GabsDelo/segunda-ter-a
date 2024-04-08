package rafaela;
import java.util.Scanner;
public class divisão {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

            double numero1,numero2, resultado;

            System.out.println("inicio da divisão");
            System.out.println("insira o primeiro valor numerico");
            numero1 = ler.nextDouble();

            System.out.println("insira o segundo valor numerico:");
            numero2 =  ler.nextDouble();

            if (numero1 ==  0 || numero2 == 0) {
                System.out.println("Divisão por zero impossível!");
        
            } else {
                resultado = numero1 / numero2;
                System.out.println("O resultado é:"+ resultado);
                System.out.println("O resto é"+ numero1%numero2);
                
                
            }

        ler.close();
    }
}
