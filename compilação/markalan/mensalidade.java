package markalan;
import java.util.Scanner;
public class mensalidade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    int idade;
    char Sexo;

    System.out.println("escreva seu sexo com 'M' ou com 'F'");
    sexo = ler.next().chars();

    if(sexo == "M"){
        if(idade<=15){
            System.out.println("mensalidade = 60");
        }
}else{

}
}
}