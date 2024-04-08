package rafaela;

import java.util.Scanner;

public class tempodeDownload {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tempo, Mb, Mbps;
        System.out.println("informe quantos Mb tem o arquivo e depois a velocidade de download ");
        Mb = input.nextDouble();
        Mbps = input.nextDouble();

        tempo = (Mb/Mbps)/60;
        System.out.println("o tempo é:"+tempo);

        input.close();

    }
}