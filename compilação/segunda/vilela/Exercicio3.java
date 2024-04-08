import java.util.Scanner;


class gabiru {
  public static void main(String[] args) {
     double numero, calculo, calculo2, calculo3, calculo4;    
    Scanner ler = new Scanner(System.in);

    System.out.println("Digite o numero inteiro:");
    numero = ler.nextDouble();
    ler.close();
    

   
    
    if (numero < 0){
      System.out.println("IMPOSSIVEL CALCULAR ");
    }
    else {
      calculo = numero*numero;
      System.out.println("O quadrado é:" + calculo);

      calculo2 = numero*numero*numero;
      System.out.println("O cubo é: " + calculo2 );

      calculo3 = Math.sqrt(numero);
      System.out.println("A raiz é: " + calculo3);

      calculo4 = Math.cbrt(numero);
      System.out.println("A raiz cubica é: " + calculo4);

    }
  }
}
