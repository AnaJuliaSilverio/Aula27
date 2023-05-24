package exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        List<Produtos> items =new ArrayList<>();
        Produtos cd1 = new Cds("Perfil",30,"1457951-785",10);
        Produtos dvds = new Dvds("Crepusculo",45,"157894-455",120);
        Produtos livro1 = new Livros("Os 7 maridos de Evelyn Hugo",35.54,"Taylor Jenkins Reid","478894-455");
        Produtos cd2 = new Cds("Flower Boy",92.90,"1453331-785",7);

        Produtos livro2 = new Livros("O jardim das borboletas:",47.40," Dot Hutchison","166694-455");
        Produtos livro3 = new Livros("O jardim das borboletas:",47.40," Dot Hutchison","166694-455");
        Produtos livro4 = new Livros("O jardim das borboletas:",47.40," Dot Hutchison","166694-457");

        items.add(cd1);
        items.add(dvds);
        items.add(livro1);
        items.add(cd2);
        items.add(livro2);
        items.add(livro3);
        items.add(livro4);

        System.out.println(buscaProduto(items));

        for (int i = 1; i < items.size(); i++) {
            if (items.get(i).equals(items.get(i-1))) System.out.println("Os produtos "+ items.get(i).getNome()+" possuem código de barra iguais");
        }

    }

    public static String buscaProduto(List<Produtos> items){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        String nomeProduto = sc.nextLine();
        for (int i = 0; i < items.size(); i++) {
            if (nomeProduto.equalsIgnoreCase(items.get(i).getNome())){
               return items.get(i).mostrarDethalesDoItem();

            }
        }
       return "Produto não encontrado";
    }
}
