package br.com.alura.screenmatch.estruturadedados;

public class ValorTeste {
    public static void main(String[] args) {
        var vetor = new Vetor();
        System.out.println(vetor.tamanho());
        vetor.adiciona(new Aluno("Patricia"));
        System.out.println(vetor.tamanho());
        vetor.adiciona(new Aluno("Maria"));
        System.out.println(vetor.tamanho());
        vetor.adiciona(new Aluno("José"));
        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());

    }
}
