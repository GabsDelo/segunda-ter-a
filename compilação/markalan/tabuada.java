package markalan;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i;
        double numero, limite;
        System.out.println("digite os valores");
        numero = ler.nextDouble();
        limite = ler.nextDouble();

        for (i = 0; i <= limite; i++) {
            System.out.println(numero + "*" + i + "=" + (numero * i));

        }
        ler.close();
    }
}