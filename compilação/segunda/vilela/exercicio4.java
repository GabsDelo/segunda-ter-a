import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
     double hora, minuto, calculo;    
    Scanner ler = new Scanner(System.in);

    System.out.println("Digite a hora:");
    hora = ler.nextDouble();
    System.out.println("Digite o minuto:");
    minuto = ler.nextDouble();

    calculo = (hora /minuto)*60;
    System.out.println("resultado"+ calculo);
    ler.close();

}
}
