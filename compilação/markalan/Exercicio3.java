package markalan;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        double altura, base, area;
        Scanner ler = new Scanner(System.in);

        System.out.println("digite a altura do triangulo:");
        altura=ler.nextDouble();

        System.out.println("digite a base do triangulo:");
        base=ler.nextDouble();

        area=(base*altura)/2;
        System.out.println("A area do triangulo é:"+ area);
        ler.close();
}
}
