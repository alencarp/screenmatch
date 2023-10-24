package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme("O poderoso chefão", 1970);
        filme.avalia(3.0);
        filme.avalia(5);
        filme.avalia(10);
        filme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + filme.getDuracaoEmMinutos());
        filme.exibeFichaTecnica();

        System.out.println();

        Filme filme2 = new Filme("Top Gun", 1990);
        filme2.avalia(8.0);
        filme2.setDuracaoEmMinutos(120);
        filme2.exibeFichaTecnica();

        System.out.println();

        Serie lost = new Serie("Lost", 2000);
        lost.setTemporadas(10);
        lost.setEpisodiosTemporada(10);
        lost.setMinutosPorEpisodio(50);
        lost.exibeFichaTecnica();
        int duracaoMaratonar = lost.getDuracaoEmMinutos();
        if ( duracaoMaratonar >= 60) {
            System.out.println("Duração para maratonar lost: " + duracaoMaratonar / 60 + " horas");
        } else {
            System.out.println("Duração para maratonar lost: " + duracaoMaratonar + " minutos");
        }

        System.out.println();

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(filme);
        calculadoraDeTempo.inclui(filme2);
        calculadoraDeTempo.inclui(lost);
        System.out.println("Tempo total = " + calculadoraDeTempo.getTempoTotal() + " minutos");

        System.out.println();
        System.out.println();

//        Filme favorito = new Filme();
//        favorito.setNome("The Matrix");
//        favorito.setAnoDeLancamento(1999);
//        favorito.setDuracaoEmMinutos(135);
//        favorito.setIncluidoNoPlano(true);
//
//        System.out.println();
//
//        Filme outro = new Filme();
//        outro.setNome("John Wick");
//        outro.setAnoDeLancamento(2014);
//        outro.setDuracaoEmMinutos(101);
//        outro.setIncluidoNoPlano(true);
//
//        System.out.println();
//
//        Serie lost = new Serie();
//        lost.setNome("La Casa de Papel");
//        lost.setAnoDeLancamento(2017);
//        lost.setIncluidoNoPlano(true);
//        lost.setAtiva(true);
//        lost.setTemporadas(5);
//        lost.setEpisodiosTemporada(10);
//        lost.setMinutosPorEpisodio(45);
//
//        System.out.println();
//
//        calculadoraDeTempo.inclui(favorito);
//        calculadoraDeTempo.inclui(outro);
//        calculadoraDeTempo.inclui(lost);
//
//        System.out.println("Tempo total: " + calculadoraDeTempo.getTempoTotal());

        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtra(filme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtroRecomendacao.filtra(episodio);

        filtroRecomendacao.filtra(filme2);

        var filmeDaPati = new Filme("Dogville", 1999);
        filmeDaPati.setDuracaoEmMinutos(136);
        filmeDaPati.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filmeDaPati);
        System.out.println("**************************************************");
        System.out.println("Tamanho da lista de filmes: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
//        System.out.println("Primeiro filme: " + filme.getNome());
        System.out.println(listaDeFilmes );
        System.out.println("toString do filme: " + listaDeFilmes.toString());


    }
}