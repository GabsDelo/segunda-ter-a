package rafaela;
import java.util.Scanner;
public class analize {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salario = 0.0;
Scanner entrada = new Scanner (System.in);
double taxaAumento1 = 1.1;
double taxaAumento2 = 1.2;
double taxaAumento3 = 1.3;
System.out.println();
System.out.print("Por favor, informe o valor do salário atual: ");
salario = entrada.nextDouble();
if(salario <= 1000) {
salario *= taxaAumento3;
}if(salario <= 2000) {
salario *= taxaAumento2;
}if (salario <= 3000) {
salario *= taxaAumento1;
}if (salario <= 4000) {
salario = (salario * taxaAumento1) + 200;
}System.out.println();
System.out.printf("Novo Salário: R$ %.2f\n\n", salario);
ler.close();
entrada.close();
    }
}
