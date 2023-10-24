package br.com.alura.screenmatch.modelos;

public class Conta implements Comparable<Conta>{

    private int saldo;

    public Conta(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() { return saldo; }

    public void setSaldo(int saldo) { this.saldo = saldo; }

    @Override
    public String toString() {
        return "Saldo = " + this.getSaldo();
    }

    @Override
    public int compareTo(Conta outraConta) {
        int saldoDestaConta = this.getSaldo();
        int saldoOutraConta = outraConta.getSaldo();
        //fazendo de maneira decrescente
        if (saldoDestaConta < saldoOutraConta) {
            return 1;
        } else if ( saldoDestaConta > saldoOutraConta) {
            return -1;
        } else {
            return 0;
        }
    }
}
