
import java.util.Scanner;
import java.io.*;

class gabire {
  public static void main(String[] args) {
     double dollar, real;    
    Scanner ler = new Scanner(System.in);
    ler.close();

    System.out.println("Digite o dollar para coversão:");
    dollar = ler.nextDouble();

    real = dollar*4.98; 
      System.out.println("O real é em dollar:" + "R$" + real);

    }
  }

