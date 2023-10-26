package br.com.alura.screenmatch.estruturadedados;

public class ValorTeste {
    public static void main(String[] args) {
        var vetor = new Vetor();
        vetor.adiciona(new Aluno("Patricia"));
        vetor.adiciona(new Aluno("Maria"));
        vetor.adiciona(new Aluno("José"));
        System.out.println(vetor.toString());
    }
}
