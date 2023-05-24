package exercicio2;

public class Circulo extends Forma{
    private double raio;
    static double pi = Math.PI;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return pi*(raio*raio);
    }

    @Override
    public double calcularPerimetro() {
        return 2*pi*raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public static double getPi() {
        return pi;
    }

    public static void setPi(double pi) {
        Circulo.pi = pi;
    }
}
