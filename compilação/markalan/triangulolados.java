package markalan;

import java.util.Scanner;

public class triangulolados {
     public static void main(String[] args) {
     double a, b, c;    
    Scanner ler = new Scanner(System.in);
    

    System.out.println("Digite o valor de A:");
    a = ler.nextDouble();

    System.out.println("Digite o valor de B:");
    b = ler.nextDouble();

    System.out.println("Digite o valor de C:");
    c = ler.nextDouble();

if ((a+b>c) && (a+c>b) &&(b+c>a)) {
    System.out.println("é um triangulo");
} else {
    System.out.println(" não é um tringulo");
}

    ler.close();
    }
}
