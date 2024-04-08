package markalan;

import java.util.Scanner;
public class Medianota {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        System.out.println("informe as notas obtidas na etapa:");

        nota1 = ler.nextDouble();
        nota2 = ler.nextDouble();
        nota3 = ler.nextDouble();
        media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("media obtida: %.1f\n",  media);

        if (media >= 0 && media < 3) {
            System.out.println("REPROVADO!");

        } else if (media > 3 && media < 7) {
            System.out.println("EXAME");
        } else if (media > 7) {
            System.out.println("APROVADO");

        }
        ler.close();
    }
}
