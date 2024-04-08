package markalan;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
     double imc, peso, altura;    
    Scanner ler = new Scanner(System.in);
    

    System.out.println("Digite o valor de Altura:");
    altura = ler.nextDouble();
    System.out.println("Digite o valor de peso:");
    peso = ler.nextDouble();

imc=peso/(altura*altura);
System.err.printf("o seu imc é: %.2f\n", imc);
   
    if (imc < 20 ){
    System.out.println("abaixo do peso"); 
    }
    else if(imc<25){
        System.out.println(" peso normal");
        }
    else if(imc<30){
        System.out.println("sobre peso");
        }
    else if(imc<40){
        System.out.println("obeso");
        }
    else {
        System.out.println("obeso morbido");

        }
    
        ler.close();
    }
}
