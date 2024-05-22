package terca.Pessoas;

public class Pessoas {
    public static void main(String[] args) {
        PessoaFisica thiago;
        Pessoa elemento;
        Pessoa paulo;
        PessoaFisica lucas;

        elemento = new Pessoa("elemento", "rua dois", "6789");
        thiago = new PessoaFisica("Thiago", "null");
        paulo = new Pessoa("Paulo Soares", "J.K.", "345");
        lucas = new PessoaFisica("Lucas", "rua monc", "324", "123");

        paulo.exibeDados();
        paulo.exibeDados("o melhor de todos!");
        thiago.exibeDados();
        elemento.exibeDados();
        lucas.exibeDados();

    }
}
