package exercicio1;

public class Cds extends Produtos{
    private int numerodDeFaixas;

    public Cds(String nome, double preco,  String codigoDeBarras, int numerodDeFaixas) {
        super(nome, preco,  codigoDeBarras);
        this.numerodDeFaixas = numerodDeFaixas;
    }

    public int getNumerodDeFaixas() {
        return numerodDeFaixas;
    }

    public void setNumerodDeFaixas(int numerodDeFaixas) {
        this.numerodDeFaixas = numerodDeFaixas;
    }

    @Override
    public String mostrarDethalesDoItem() {
        return super.mostrarDethalesDoItem() + "Numero de faixas: " + numerodDeFaixas;

    }
}
