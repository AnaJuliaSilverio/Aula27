package exercicio1;

public class Livros extends Produtos{
    private String autor;

    public Livros(String nome, double preco,String autor,String codigoDeBarras) {
        super(nome, preco, codigoDeBarras);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String mostrarDethalesDoItem() {
        return super.mostrarDethalesDoItem()+"Autor: " + autor ;
    }
}
