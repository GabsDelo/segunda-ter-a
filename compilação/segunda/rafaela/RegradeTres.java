package rafaela;

import java.util.Scanner;

public class RegradeTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double  numero1, numero2, numero3, variavel;

        System.out.println("Digite o 1º valor:");
        numero1 = input.nextDouble();

        System.out.println("Digite o 2º valor:");
        numero2 = input.nextDouble();

        System.out.println("Digite o 3º valor:");
        numero3 = input.nextDouble();

        variavel = (numero2*numero3)/numero1;
        System.out.printf("o resultado é: %.2f,\n", variavel);
        input.close();

    }
}
