package exercicio1;

public abstract class Produtos {
    protected String nome;
    protected double preco;

    protected String codigoDeBarras;

    public Produtos(String nome, double preco,String codigoDeBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Produtos)  return (this.codigoDeBarras.equals(((Produtos) obj).codigoDeBarras));
        else return false;

    }


    public String mostrarDethalesDoItem() {
        return "Nome: " + nome +
                "\nPreco:R$" + preco +
                "\nCodigo De Barras: " + codigoDeBarras +
                '\n';
    }



}
