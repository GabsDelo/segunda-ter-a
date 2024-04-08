package markalan;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[]Args){
        int mensalidade, desconto, salarioLiquido;
        Scanner ler = new Scanner(System.in);

        System.out.println("informe o valor da mensalidade");
        mensalidade = ler.nextInt();

        System.out.println("informe a porcentagem de desconto");
        desconto = ler.nextInt();

        salarioLiquido = mensalidade-(mensalidade*desconto/100);
        System.out.println("a mensalidade é :" + salarioLiquido);
        ler.close();
    }
    
}
