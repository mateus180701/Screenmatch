package br.com.alura.sreenmatch.PrincipalComListas;

import br.com.alura.sreenmatch.excecoes.ErroDeConversaoException;
import br.com.alura.sreenmatch.modelos.Titulo;
import br.com.alura.sreenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        String busca = "";

        List<Titulo> titulos = new ArrayList<>();
        while (!busca.equalsIgnoreCase("sair")) {
            System.out.println(" digite o filme que deseja buscar: ");
            busca = leitura.nextLine();
            titulos = new ArrayList<>();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }
            String endereco = "https://www.omdbapi.com/?T=" + busca.replace(" ", "+") + "&apikey=20a88c70";
            System.out.println(endereco);

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);


                Gson gson = new GsonBuilder()
                        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                        .create();
                //Titulo meuTitulo = gson.fromJson(json , Titulo.class);
                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);


                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("titulo ja convertido");
                System.out.println(meuTituloOmdb);


                titulos.add(meuTitulo);
            } catch (NumberFormatException e) {
                System.out.println("ocorreu um erro! ");
                System.out.println(e.getMessage());

            } catch (ErroDeConversaoException e) {
                System.out.println("ocorreu um novo erro no campo de busca! ");
            }
        }
        System.out.println(titulos);
        System.out.println("o programa finalizou corretamente!");


    }
}
