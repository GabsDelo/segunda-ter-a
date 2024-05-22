package terca.Pessoas;

public class Pessoa extends Object {
    protected String nome, endereco, fone;

    public Pessoa(String nome, String endereco, String fone) {
        this.nome = nome;
        this.endereco = endereco;
        this.fone = fone;
    }
    //public Pessoa(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;

    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;

    }
    public void exibeDados(){
        System.out.println(" \nnome: "+nome+"\nendereço: "+endereco+" \nfone: "+fone);
    }
    public void exibeDados(String titulo){
        System.out.println(titulo);
        System.out.println(" \nnome: "+nome+"\n endereço: "+endereco+" \nfone: "+fone);
    

}
}