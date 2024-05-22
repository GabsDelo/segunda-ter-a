package segunda;


public class Voo {

    int numero;
    String origem;
    String destino;
    int lugaresDisponiveis;

    public Voo(int numero, String origem, String destino, int lugaresDisponiveis) {
        this.numero = numero;
        this.origem = origem;
        this.destino = destino;
        this.lugaresDisponiveis = lugaresDisponiveis;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getLugaresDisponiveis() {
        return lugaresDisponiveis;
    }

    public void setLugaresDisponiveis(int lugaresDisponiveis) {
        this.lugaresDisponiveis = lugaresDisponiveis;
    }

    @Override
    public String toString() {
        return "Número: " + this.numero + "\n"
                + "Origem: " + this.origem + "\n"
                + "Destino: " + this.destino + "\n"
                + "Lugares Disponiveis: " + this.lugaresDisponiveis + "\n";

    }

    public boolean reservarLugar() {
        
        if (this.lugaresDisponiveis > 0) {
            this.lugaresDisponiveis--;
            return true;
        } else {
            return false;
        }

    }

}
