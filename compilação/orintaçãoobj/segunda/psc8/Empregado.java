package segunda;

public class Empregado {
    private String nome;
    private int idade;
    private double salario;

    public Empregado(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;

    }

    public boolean promover() {
        if (idade > 18) {
            aumentarSalario(25);
            return true;
        } else {
            return false;
        }
    }

    public void aumentarSalario(double porcentagem) {
        salario += salario + (porcentagem / 100);
    }

    public void demitir(int motivo) {
        switch (motivo) {
            case 1:
                System.out.println("Motivo por causa Justa. O funcionario deve cumprir aviso previo");
            case 2:
                double multa = salario * 0.40;
                System.out.println("Por decisão do empregado foi realizado a multa");

            case 3:
            double salarioAposentadoria;
                if (salario <= 2000) {
                    salarioAposentadoria = 1500;

                } else if (salario <= 3000) {
                    salarioAposentadoria = 2500;

                } else if (salario <= 4000) {
                    salarioAposentadoria = 3500;

                } else  {
                    salarioAposentadoria = 4000;

                }
                System.out.println("O salario que vai receber da aposentadoria é : R$"+salarioAposentadoria);

                break;

            default:
            System.out.println("motivo invalido");
                break;
        }
    }

        public void fazerAniversario(){
            idade += 1;
        }

        @Override
        public String toString(){
        return "Nome: " + this.nome + "\n"
        + "Idade: " + this.idade + "\n"
        + "Salario: " + this.salario + "\n";
        }

    }
