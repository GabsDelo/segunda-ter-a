
import java.util.Scanner;
import java.io.*;

class gabibom {
  public static void main(String[] args) {
     double celcius, farenheit;    
    Scanner ler = new Scanner(System.in);
    ler.close();

    System.out.println("Digite a temperatura para conversão:");
    celcius = ler.nextDouble();

    farenheit = (celcius*1.8) + 32; 
      System.out.println("A temperatura convertida é:" + farenheit);

    }
  }

