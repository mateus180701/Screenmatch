package br.com.alura.sreenmatch.PrincipalComListas;

import br.com.alura.sreenmatch.modelos.Filme;
import br.com.alura.sreenmatch.modelos.Serie;
import br.com.alura.sreenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("carros", 2006);
        meuFilme.avalia(8);
        Serie suits = new Serie("suits", 2005);
        suits.avalia(7);
        Filme outroFilme = new Filme("branquelas", 2003);
        outroFilme.avalia(6);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(suits);
        lista.add(outroFilme);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            System.out.println(item.getAnoLancamento());

            if (item instanceof Filme filme && filme.getclassificacao() > 5) {
                System.out.println(filme.getclassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("adam sandler");
        buscaPorArtista.add("mateus");
        buscaPorArtista.add("isadora");
        buscaPorArtista.add("catu");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("lista ordenada: ");
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));


    }
}