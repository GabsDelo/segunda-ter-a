package rafaela;
import java.util.Scanner;
public class areaPerimetroDiagonaldoRetangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double diagonal, alturaH, base, perimetro, Area;

        System.out.println("informe a altura e em seguida a base:");
        alturaH = input.nextDouble();
        base = input.nextDouble();

        perimetro = 2*(base+alturaH);
        System.out.println("perimetro é:" + perimetro);

        Area = base * alturaH;
        System.out.println("Area é:"+Area);

        diagonal = Math.sqrt(Math.pow(base,2)+Math.pow(alturaH,2));
        System.out.println("A Diagonal é:"+ diagonal);
        input.close();

    }
    
}
