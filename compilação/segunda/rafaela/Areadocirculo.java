package rafaela;
import java.util.Scanner;
public class Areadocirculo {
    public static void main(String[] args) {
        Scanner lido = new Scanner(System.in);

        float raio;
        double n, area;

        System.out.println("Vamos calcular a Area de um circulo");
        System.out.println("-----------------------------------");
        System.out.println("Insira o raio obtido, vamos ter o valor de 'n' como PI = 3,14");

        raio = lido.nextFloat();

        n = 3.14159;

        area = n*(raio*raio);
        System.out.printf("A=%.4f", area);

        lido.close();
    }
}
