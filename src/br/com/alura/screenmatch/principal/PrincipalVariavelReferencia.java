package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;

public class PrincipalVariavelReferencia {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Sing", 2016);
        Filme filme2 = new Filme("Sing", 2016);
        Filme filme3 = filme1;

        if (filme1.equals(filme2)) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }

    }
}
