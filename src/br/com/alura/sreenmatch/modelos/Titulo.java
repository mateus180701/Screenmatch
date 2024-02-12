package br.com.alura.sreenmatch.modelos;

import br.com.alura.sreenmatch.excecoes.ErroDeConversaoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{

    @SerializedName("Tittle")
    private String nome;
    @SerializedName("Year")
    private int anoLancamento;
    private int duracaoMinutos;
    private double somaDasAvaliacoes;
    private boolean inseridoNoPlano;
    private int totalAvaliacoes;



    public Titulo( String nome, int anoLancamento){
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.tittle();

        if ( meuTituloOmdb.year().length() > 4){
            throw new ErroDeConversaoException(" nao consegui converter pois a string tem mais que 4 caracteres");
        } this.anoLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoMinutos = Integer.valueOf(meuTituloOmdb.runtime());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public boolean isInseridoNoPlano() {
        return inseridoNoPlano;
    }

    public void setInseridoNoPlano(boolean inseridoNoPlano) {
        this.inseridoNoPlano = inseridoNoPlano;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void exibeFichaTecnica() {
        System.out.println(nome);
        System.out.println(anoLancamento);
        System.out.println(duracaoMinutos);

    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double media() {
        return somaDasAvaliacoes / totalAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "nome='" + nome + '\'' +
                ", anoLancamento=" + anoLancamento +
                '}';
    }
}

