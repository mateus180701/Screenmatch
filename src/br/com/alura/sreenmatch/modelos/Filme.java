package br.com.alura.sreenmatch.modelos;

import br.com.alura.sreenmatch.calculos.classificavel;

public class Filme extends Titulo implements classificavel {
    private String diretor;

    public Filme( String nome, int anoLancamento){
        super( nome, anoLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


    @Override
    public int getclassificacao() {
         return (int) media() / 2;
    }

    @Override
    public String toString() {
        return "o filme é: " + this.getNome() + " (" + this.getAnoLancamento() + ") " + "e a a nota é: "+ this.getclassificacao();
    }
    }


