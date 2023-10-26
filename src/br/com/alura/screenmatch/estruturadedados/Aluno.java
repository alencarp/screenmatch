package br.com.alura.screenmatch.estruturadedados;

public class Aluno {

    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        Aluno outroAluno = (Aluno) obj;
        if (outroAluno != null) {
            return this.nome.equals(outroAluno.getNome());
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getNome();
    }
}
