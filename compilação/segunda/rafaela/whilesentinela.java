package rafaela;
import java.util.Scanner;
public class whilesentinela {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double soma=0, nota, media;
        int qtde = 0;
        System.out.println("informe um nota");
        nota = ler.nextDouble();
        while (nota >= 0) {
           

            soma +=nota;
            qtde++;
            System.out.println("informe um nota");
        nota = ler.nextDouble();
        }
     media=soma/qtde;
System.out.println("Media:" + media);
ler.close();
    }
}
