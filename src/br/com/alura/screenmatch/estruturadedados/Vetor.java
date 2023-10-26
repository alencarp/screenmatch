package br.com.alura.screenmatch.estruturadedados;

import java.util.Arrays;

//Armazenaremos Alunos de forma sequencial - utilizando Array
public class Vetor {

    private Aluno[] vetorDeAlunos = new Aluno[10];
    private int totalDeAlunos = 0;

    public void adiciona(Aluno aluno) {
        vetorDeAlunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
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
        return totalDeAlunos;

    }

    public String toString(){
        return Arrays.toString(vetorDeAlunos);
    }

}
