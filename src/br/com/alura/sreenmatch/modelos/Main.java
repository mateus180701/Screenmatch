package br.com.alura.sreenmatch.modelos;

import br.com.alura.sreenmatch.calculos.FiltroRecomendacao;
import br.com.alura.sreenmatch.calculos.calculadoraDeTempo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("carros", 2006);
        // entendendo sobre o metodo construtor
        //meuFilme.setNome("carros");
        //meuFilme.setAnoLancamento(2006);
        meuFilme.setDuracaoMinutos(120);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(6);
        System.out.println(meuFilme.getSomaDasAvaliacoes());
        System.out.println("o total de avaliaçoes foi de: " + meuFilme.getTotalAvaliacoes());
        System.out.println("a media de notas do filme é de: "+ meuFilme.media());


        Serie suits = new Serie("suits", 2005);
        //suits.setNome("suits");
        //suits.setAnoLancamento(2005);
        System.out.println("o nome da serie é: "+ suits.getNome());
        System.out.println("o ano de lancamento é: " + suits.getAnoLancamento());
        suits.setTemporadas(10);
        suits.setEpisodios(12);
        suits.setMinutosPorEpisodio(50);
        System.out.println("o tempo necessario para maratonar sua serie é de: "+ suits.duracaoMinutos());


        Filme outroFilme = new Filme("branquelas", 2003);
        //outroFilme.setNome("branquelas");
        outroFilme.setAnoLancamento(2003);
        outroFilme.setDuracaoMinutos(200);
        outroFilme.avalia(4);

        calculadoraDeTempo calculadora = new calculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(suits);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
;
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(suits);
        episodio.setTotalVizualizacoes(300);
        filtro.filtra(episodio);
        filtro.filtra(meuFilme);

        Filme filmeDoMateus = new Filme("esposa de mentirinha", 2007);
        //filmeDoMateus.setNome("esposa de mentirinha");
        filmeDoMateus.setAnoLancamento(2007);
        filmeDoMateus.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(filmeDoMateus);
        System.out.println("o tamanho da lista é: " + listaDeFilmes.size());
        System.out.println("primeiro filme é: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("o toString é: " + listaDeFilmes.get(0).toString());







    }
}