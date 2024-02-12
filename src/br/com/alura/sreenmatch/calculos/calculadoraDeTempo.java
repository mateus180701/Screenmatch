package br.com.alura.sreenmatch.calculos;

import br.com.alura.sreenmatch.modelos.Titulo;

public class calculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoFilme();
//    }
//
//    public void inclui(Serie s){
//        tempoTotal += s.duracaoSerieMinutos();


    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoMinutos();

    }

}
