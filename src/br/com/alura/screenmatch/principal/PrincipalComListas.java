package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {

    public static void main(String[] args) {
        Filme filme1 = new Filme("O poderoso chefão", 1970);
        filme1.avalia(9);
        Filme filme2 = new Filme("Top Gun", 1990);
        filme2.avalia(6);
        var filmeDaPati = new Filme("Sing", 2016);
        filmeDaPati.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        Filme f = filmeDaPati;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filmeDaPati);
//        lista.add(f);
        lista.add(lost);

        for (Titulo item: lista) {
//            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
//                Filme filme = (Filme) item;
//                System.out.println(filme);
//                System.out.println(filme.getClassificacao());
            }
        }

//        lista.forEach(titulo -> System.out.println(titulo));

//        lista.forEach(System.out::println);

//        ArrayList<String> listaDeFilmes = new ArrayList<>();
        List<Titulo> listaDeFilmes = new LinkedList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filmeDaPati);
//        System.out.println(listaDeFilmes);

//        Collections.sort(listaDeFilmes);
//        System.out.println("Depois da ordenação: " + listaDeFilmes);

        Collections.sort(lista);
        System.out.println("depois da ordenação: " + lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenado por ano: " + lista);



    }


}
