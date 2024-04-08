package markalan;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, total;
        Scanner ler = new Scanner(System.in);

        System.out.println("digite a 1º nota:");
        nota1 = ler.nextDouble();

        System.out.println("digite a 2º nota:");
        nota2 = ler.nextDouble();

        System.out.println("digite a 3º nota:");
        nota3 = ler.nextDouble();

        total = nota1 + nota2 + nota3;
        if (total <= 70) {
            System.out.println("repetente");

        } else {

            System.out.println("o total da notas foram :" + total);
        }
        ler.close();
    }
}
