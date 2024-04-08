package markalan;

import java.util.Scanner;

public class notarepetição2 {
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
            soma = soma + nota;

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