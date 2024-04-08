package markalan;

import java.util.Scanner;

public class notarepetição {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i;
        double nota, soma, media;
        soma = 0;
        for (i = 1; i <= 3; i++) {
            System.out.println("digite a nota");
            nota = ler.nextDouble();
            soma = soma + nota;

        }
        
        System.out.println(soma);
        if (soma>=70) {
            System.out.println("Aprovada");
            
        } else {
            System.out.println("Reprovado");
            
        }

    }
}