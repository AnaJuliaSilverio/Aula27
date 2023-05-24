package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Forma> formasGeometricas = new ArrayList<>();

        Forma circulo = new Circulo(6);
        Forma quadrado = new Quadrado(8);
        Forma retangulo = new Retangulo(9,8);
        Forma circulo2 = new Circulo(2);
        Forma quadrado2 = new Quadrado(4);


        formasGeometricas.add(circulo);
        formasGeometricas.add(quadrado);
        formasGeometricas.add(retangulo);
        formasGeometricas.add(circulo2);
        formasGeometricas.add(quadrado2);

        for (int i = 0; i <formasGeometricas.size() ; i++) {
            String nomeCompleto = formasGeometricas.get(i).getClass().getName();
            System.out.println("Area do "+(formasGeometricas.get(i)).nomeDaClase(nomeCompleto)+" = "+formasGeometricas.get(i).calcularArea());
            System.out.println("Perimetro do "+formasGeometricas.get(i).nomeDaClase(nomeCompleto)+" = "+formasGeometricas.get(i).calcularPerimetro());
            System.out.println(" ");
        }


    }
}