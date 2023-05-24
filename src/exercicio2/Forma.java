package exercicio2;

import exercicio1.Produtos;

public abstract class Forma {
    public Produtos p;
    public abstract double calcularArea();

    public abstract double calcularPerimetro();
    public String nomeDaClase(String nome){
        String nomeApenasClasse[] = nome.split("[.]");
        return nomeApenasClasse[1];
    }

}
