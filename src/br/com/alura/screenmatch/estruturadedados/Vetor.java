package br.com.alura.screenmatch.estruturadedados;

import java.util.Arrays;

//Armazenaremos Alunos de forma sequencial - utilizando Array
public class Vetor {

    private Aluno[] vetorDeAlunos = new Aluno[10];

    public void adiciona(Aluno aluno) {
        int posicaoVazia = tamanho() - 1;
        vetorDeAlunos[posicaoVazia] = aluno;
    }

    public Aluno pega (int posicao) {
        return vetorDeAlunos[posicao];
    }

    public void remove (int posicao) {
        vetorDeAlunos[posicao] = null;
    }

    public boolean contem (Aluno aluno) {
        for (Aluno a: vetorDeAlunos) {
            return aluno.equals(a);
        }
        return false;
    }

    public int tamanho() {
        return vetorDeAlunos.length;
    }

    public String toString(){
        return Arrays.toString(vetorDeAlunos);
    }

}
