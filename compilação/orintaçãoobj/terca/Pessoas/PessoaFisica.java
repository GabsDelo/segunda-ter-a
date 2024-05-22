package terca.Pessoas;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String endereco, String fone, String cpf) {
        super(nome, endereco, fone);
        this.cpf = cpf;

    }

    public PessoaFisica(String nome, String endereco) {
        super(nome, endereco, "&&&&&");
        this.cpf="000";

    }
    public void exibeDados(){
        super.exibeDados();
        System.out.println("cpf :"+cpf);
    }
    public void show(){}
}
