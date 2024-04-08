
import java.util.Scanner;
import java.io.*;

class gabibumax {
  public static void main(String[] args) {
     double numero1, numero2;    
    Scanner ler = new Scanner(System.in);
    ler.close();

    System.out.println("Digite o 1º valor:");
    numero1 = ler.nextDouble();
    System.out.println("Digite o 2º valor:");
    numero2 = ler.nextDouble();
     if (numero1 == numero2){
        System.out.println("numeros iguais!");
     }
      else if ( numero2 < numero1){
        
        System.out.println("numero1 é maior!");
      }
       else if (numero2 > numero1){
        System.out.println("numero2 é maior!");
       }
      }
    }
  

