package exercicio1;

public class Dvds extends Produtos{
    private double duracao;

    public Dvds(String nome, double preco, String codigoDeBarras, double duracao) {
        super(nome, preco, codigoDeBarras);
        this.duracao = duracao;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
    @Override
    public String mostrarDethalesDoItem() {
        return super.mostrarDethalesDoItem() + "Tempo de duração: " + duracao;

    }
}
