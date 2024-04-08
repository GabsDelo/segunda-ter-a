package rafaela;

import java.util.Scanner;

public class Pitagoras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         double A, B, C;

         System.out.println("informe os valores");
         A = input.nextDouble();
         B = input.nextDouble();

         C = Math.sqrt((A*A)+(+B*B));
         System.out.printf("a resposta do teorema de pitagoras é: %.2f\n", C);

         input.close();
         
    }
}
