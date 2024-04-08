package markalan;

import java.util.Scanner;

public class funcao {
     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double x;

        System.out.println("digite 1 numero");
        x = ler.nextDouble();
        
       
        if (x<-2) {
            System.out.println("REsultado = "+ (2*x+2));
 
        } else if (x<3) {
            System.out.println("resultado = 3 ");
        } else {
            System.out.println("resultado =" + (-x));

        }
        ler.close();
    }
}
