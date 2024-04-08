package markalan;

import java.util.Scanner;

class gabibum {
  public static void main(String[] args) {
     double a, b, c, x1, x2, delta;    
    Scanner ler = new Scanner(System.in);
    ler.close();

    System.out.println("Digite o valor de A:");
    a = ler.nextDouble();

    System.out.println("Digite o valor de B:");
    b = ler.nextDouble();

    System.out.println("Digite o valor de C:");
    c = ler.nextDouble();

    delta = (b*b) - (4*a*c);
    if (delta < 0 ){
    System.out.println("Não existe raiz real!!"); 
    }
    else{

    x1 = -b-(Math.sqrt(delta))/2*a; 
      System.out.println("O baskara x1 é:" + x1);

    x2 = +b-(Math.sqrt(delta))/2*a; 
      System.out.println("O baskara x2 é:" + x2);
        }
    }
  }

