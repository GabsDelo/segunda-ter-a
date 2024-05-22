package segunda;

import java.util.ArrayList;
import java.util.Scanner;

public class Emprego {
    public static void main(String[] args) {
        ArrayList<Empregado> empregados = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        int opcao;
        int posicao;

        while (true) {
            System.out.println(
                    "\n[1] Efetuar cadastro\n[2]promover \n[3]Aumnetar salario \n[4]demitir \n[5]Aniversario \n[6]Consultar \n[7] Sair ");
            System.out.println("Escolha uma opção: ");
            opcao = ler.nextInt();
            ler.nextLine(); // Limpa o buffer
            switch (opcao) {

                case 1:
                    System.out.println("Informe as informacoes do novo colaborador: ");
                    String nome = ler.nextLine();
                    int idade = ler.nextInt();
                    double salario = ler.nextDouble();
                    Empregado empregado = new Empregado(nome, idade, salario);
                    empregados.add(empregado);
                    break;

                case 2:

                    System.out.println("Informe o Colaborador a ser promovido: ");
                    posicao = ler.nextInt();
                    empregados.get(posicao).promover();
                    System.out.println("Empregado promovido :" + empregados.get(posicao).getNome());

                    break;
                case 3:

                    System.out.println("Informe o Colaborador a ser promovido: ");
                    posicao = ler.nextInt();
                    empregados.get(posicao).aumentarSalario(posicao);
                    break;
                case 4:

                    System.out.println("Informe o Colaborador a ser deimitido: ");
                    posicao = ler.nextInt();
                    empregados.get(posicao).demitir(posicao);
                    break;
                case 5:

                    System.out.println("Informe o Colaborador a fazer aniversario: ");
                    posicao = ler.nextInt();
                    empregados.get(posicao).fazerAniversario();
                    break;
                case 6:

                    break;

                case 7:
                    System.out.println("Sair....");

                default:
                    System.out.println("Opção Inválida!");

            }

        }

    }
}