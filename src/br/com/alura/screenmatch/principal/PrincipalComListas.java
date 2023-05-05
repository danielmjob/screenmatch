package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville",2003); // usando var para inferencia de tipo
        filmeDoPaulo.avalia(10);

        Filme f1 = filmeDoPaulo; // aponta para o mesmo objeto


        Serie lost = new Serie("Lost",2000);

        List<Titulo> lista = new LinkedList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoPaulo);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());

            // testa se é um filme (poderia ser uma serie ou outro tipo) e se a classificação é maior que 2
            // se for então mostra, caso contratio não
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação " + filme.getClassificacao());
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println("Depois de Ordenado");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois de Ordenado");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de títulos ordenados");
        Collections.sort(lista); // organizando as classes de titulos
        System.out.println(lista);

        // uma outra forma de comparar mais rapidamente
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        System.out.println("Após nova comparação usando Comparator.comparing (ANO)");
        System.out.println(lista);
    }
}
