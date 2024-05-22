package terca.carro;

public class Carro {
    private String placa;
    private int ano;
    private String modelo;

    public Carro(String placa, int ano, String modelo) {
        this.placa = placa;
        this.ano = ano;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano>=1800) {
            
            this.ano = ano;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != "") {
            this.modelo = modelo;

        } else {

        }
    }
}
