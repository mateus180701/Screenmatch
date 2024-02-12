package br.com.alura.sreenmatch.calculos;

import br.com.alura.sreenmatch.modelos.Filme;

public class FiltroRecomendacao {

    public void filtra( classificavel classificavel) {
        if (classificavel.getclassificacao() >= 4) {
            System.out.println("filme muito recomendado");
        } else if (classificavel.getclassificacao() >= 2) {
            System.out.println("filme bom");
        } else {
            System.out.println("adicionar na sua lista de mais tarde!");
        }
    }
}
