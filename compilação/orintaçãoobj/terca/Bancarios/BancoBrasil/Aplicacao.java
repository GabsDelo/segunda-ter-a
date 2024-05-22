package terca.Bancarios.BancoBrasil;

import terca.Bancarios.Bancario.ContaCorrente;

public class Aplicacao {
    public static void main(String[] args) {
        ContaCorrente cc;
        cc = new ContaCorrente();

      /*  System.out.println("seu saldo = "+cc.getSaldo());
       cc.depositar(500);
       System.out.println("seu saldo = "+cc.getSaldo());
       cc.sacar(200);
       System.out.println("seu saldo = "+cc.getSaldo());
       cc.sacar(200);*/

       System.out.println(cc.toString()+" de saldo "+ cc.getSaldo());



    }
}