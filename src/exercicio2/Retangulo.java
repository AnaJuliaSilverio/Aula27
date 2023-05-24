package exercicio2;

public class Retangulo extends Forma{
    protected double lado;
    protected double altura;

    public Retangulo(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return lado*altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2*(lado*altura);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
