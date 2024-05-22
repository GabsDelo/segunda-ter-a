package terca;

public class Quarto {
    public static void main(String[] args) {
        Retangulo quarto1, quarto2;
        quarto1 = new Retangulo();
        quarto2 = new Retangulo();

        quarto1.setAltura(10);
        quarto1.setLargura(20);

        quarto2.setAltura(30);
        quarto2.setLargura(10);

        System.out.println("Area do quarto 1 é: " + quarto1.calculaArea());
        System.out.println("Perimetro do quarto 1 é: " + quarto1.calculaperimetro());

        System.out.println("Area do quarto 2 é: " + quarto2.calculaArea());
        System.out.println("Perimetro do quarto 2 é: " + quarto2.calculaperimetro());
    }

}
