package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Conta;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalContas {

    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<>();
        contas.add(new Conta(9));
        contas.add(new Conta(1));
        contas.add(new Conta(15));

        Collections.sort(contas);
        System.out.println(contas);

    }


}
