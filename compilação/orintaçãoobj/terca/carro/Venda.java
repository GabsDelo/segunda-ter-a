package terca.carro;

public class Venda{
    static private int contador = 0;
    private int ano;
    private String modelo;

    public Venda(String placa, int ano, String modelo) {
        
        this.ano = ano;
        this.modelo = modelo;
    }
    public Venda(){
        contador ++;
    }

    public int getContador() {
        return contador;
    }

    @SuppressWarnings("static-access")
    public void setContador(int contador) {
        this.contador = contador;
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