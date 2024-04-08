package markalan;

import java.util.Scanner;

public class notarepetição3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i, quantidade;
        double nota, soma;
        soma = 0;
        System.out.println("informe a quantidade de notas");
        quantidade = ler.nextInt();
        for (i = 1; i <= quantidade; i++) {
            System.out.println("digite a nota");
            nota = ler.nextDouble();
            double prova;
            System.out.println("informe o valor da prova:");
            prova = ler.nextDouble();
            if (nota >= 0.7 * prova) {
                System.out.println("Parabens");
            } else {
                System.out.println("estude mais");
            }
            soma+=nota;
        }

        System.out.println(soma);
        if (soma >= 70) {
            System.out.println("Aprovada");

        } else {
            System.out.println("Reprovado");

        }
        ler.close();
    }
}