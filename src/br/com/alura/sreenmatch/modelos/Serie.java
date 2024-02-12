package br.com.alura.sreenmatch.modelos;

public class Serie extends Titulo {

    private int temporadas;
    private boolean ativo;
    private int episodios;
    private int duracaoMinutos;

    public Serie( String nome, int anoLancamento){
        super( nome, anoLancamento);

    }


    public int getTemporadas() {
        return temporadas;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public int getduracaoMinutos() {
        return duracaoMinutos;
    }


    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.duracaoMinutos = minutosPorEpisodio;
    }

    public int duracaoMinutos() {
        return temporadas * episodios * duracaoMinutos;
    }

    public String toString(){
        return " o nome da serie é: "+ getNome();
    }

    }

