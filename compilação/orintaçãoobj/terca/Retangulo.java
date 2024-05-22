package terca;

public class Retangulo {

    private float altura, largura;

    public Retangulo() {
        altura = 0;
        largura = 0;
    }

    public float getAltura() {
        return (altura);

    }

    public void setAltura(float alt) {
        if (alt > 0) {
            altura = alt;
        }
    }

    public float getLargura() {
        return (largura);

    }

    public void setLargura(float larg) {
        if (larg > 0) {
            largura = larg;
        }

    }

    public float calculaArea() {
        return altura * largura;
    }

    public float calculaperimetro() {
        return 2 * altura + 2 * largura;
    }

}
