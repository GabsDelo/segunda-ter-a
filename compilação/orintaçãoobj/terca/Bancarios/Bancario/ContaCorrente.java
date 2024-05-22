package terca.Bancarios.Bancario;

public class ContaCorrente {
    Endereco endereco;
   private int codigo, agencia;
   private double saldo;
    String nome;

    public ContaCorrente() {
        codigo = 0;
        agencia = 0;
        saldo = 100;
    }
    public void setCodigo(int cod){
        if (cod>0) {
            codigo = cod;
        }
    }
    public int getCodigo(){
        return codigo;
    }
    public double getSaldo(){
        return saldo;
    }
    public void depositar(double valor){
        if (valor>0) {
            saldo+=valor;
        }
    }
    public void sacar(double valor){
        if (valor<=saldo) {
        saldo-=valor;
        }
    }
    public String toString(){
        String temp;
        temp = "Esta é uma conta corrente de codigo "+ codigo+ " e agencia "+ agencia;
        return temp;
    }
}

