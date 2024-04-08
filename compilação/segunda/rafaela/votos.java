package rafaela;
import java.util.Scanner;
public class votos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double votoBranco, votoNulo, votoValido,total, porcentagem1, porcentagem2, porcentagem3;

        System.out.println("Digite a quantidade de votos nulos, brancos e validos obitidos para calculo da porcentagem: ");
    
        votoBranco = ler.nextDouble();
        votoNulo = ler.nextDouble();
        votoValido = ler.nextDouble();

        total = votoBranco+votoNulo+votoValido;
        porcentagem1 = (votoBranco/total);
        porcentagem2 = (votoNulo/total);
        porcentagem3 = (votoValido/total);

        System.out.printf("A porcentagem dos votos em branco é: %.0f %% \n" , porcentagem1*100);
        System.out.printf("A porcentagem dos votos Nulos é: %.0f %% \n", porcentagem2*100);
        System.out.printf("A porcentagem dos votos validos é: %.0f %%\n ", porcentagem3*100);
        

ler.close();
    }
    
}
