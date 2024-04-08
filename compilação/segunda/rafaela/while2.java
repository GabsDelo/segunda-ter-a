package rafaela;

import java.util.Scanner;

public class while2 {
    public static void main(String[] args) {
        
        int numero;
        Scanner input = new Scanner(System.in);

        System.out.println("informe 0 a 1000");
        numero = input.nextInt();

        while (numero <=1000) {
            numero *= 2;
            System.out.println(numero);
            
        }
        System.out.println("numero final =" + numero);
        input.close();
    }
}
