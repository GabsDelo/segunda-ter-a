package terca;

import java.util.Scanner;

public class Areaeperime {
    public static void main(String[] args) {
        float altura, area, largura, perimetro;
       Scanner ler = new Scanner(System.in);
        System.out.println("Informe a altura");
        altura = ler.nextFloat();
        System.out.println("Informe a largura");
        largura = ler.nextFloat();
        area = altura * largura;
        perimetro=2*altura+2*largura;
        System.out.println("area é: "+area);
        System.out.println("perimetro é: "+perimetro);
        ler.close();
    }
}
