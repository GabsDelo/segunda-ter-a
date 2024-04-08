package rafaela;
import java.util.Scanner;
public class hora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int HH, MM,minpassados; 

        System.out.println("informe o tempo");
        HH=input.nextInt();
        MM=input.nextInt();
         minpassados= HH+MM/60;
         System.out.println("tempo passado é:"+minpassados);
         input.close();

    }
}