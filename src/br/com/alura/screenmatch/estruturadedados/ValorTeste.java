package br.com.alura.screenmatch.estruturadedados;

public class ValorTeste {
    public static void main(String[] args) {
        var vetor = new Vetor();
        var aluno1 = new Aluno("Patricia");
        var aluno2 = new Aluno("Maria");
        var aluno3 = new Aluno("José");

        vetor.adiciona(aluno1);
        vetor.adiciona(aluno2);
        vetor.adiciona(aluno3);

        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());

        boolean contemNaLista = vetor.contem(aluno2);
        System.out.println(contemNaLista);
    }
}
