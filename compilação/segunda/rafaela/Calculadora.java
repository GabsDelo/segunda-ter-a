package rafaela;

import java.util.Scanner;

class Calculadora {

    public static void main(String[] args) {

        double numero1, numero2, resultado;

        char operacao;

        Scanner ler = new Scanner(System.in);

        System.out.println("informe o primeiro número:");
        numero1 = ler.nextDouble();
        System.out.println("informe o 2º número:");
        numero2 = ler.nextDouble();

        System.out.println("menu calculadora");
        System.out.println("[+] somar");
        System.out.println("[*] multiplicar");
        System.out.println("[-] subtração");
        System.out.println("[/] divisão");
        System.out.println("[%] resto de divisão");

        System.out.println("escolha uma operação");
        operacao = ler.next().charAt(0);
        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("Resultado" + resultado);
                break;

            case '*':
                resultado = numero1 * numero2;
                System.out.println("Resultado" + resultado);
                break;

            case '-':
                resultado = numero1 - numero2;
                System.out.println("Resultado" + resultado);
                break;

            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.printf("Resultado %.2f", resultado);
                } else {
                    System.out.println("Divisão por zero!");
                }

                break;

            case '%':
                resultado = numero1 % numero2;
                System.out.printf("Resultado %.2f\n", resultado);
                break;

            default:
                System.out.println("operação invalida!");
                break;
        }
        ler.close();
    }
}