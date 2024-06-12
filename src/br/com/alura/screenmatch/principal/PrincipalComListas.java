package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Movie oExorcista = new Movie("O Exorcista", 1973);
        oExorcista.avalia(10);
        Movie ramboProgramadoParaMatar = new Movie("Rambo - Programado para Matar", 1982);
        ramboProgramadoParaMatar.avalia(9);
        var pulpFiction = new Movie("Pulp Fiction: Tempo de Violência", 1994);
        pulpFiction.avalia(10);
        Serie gameOfThrones = new Serie("Game of Thrones", 2011);

        ArrayList<Titulo> listaDeAssistidos= new ArrayList<>();
        listaDeAssistidos.add(pulpFiction);
        listaDeAssistidos.add(oExorcista);
        listaDeAssistidos.add(ramboProgramadoParaMatar);
        listaDeAssistidos.add(gameOfThrones);
        for (Titulo item:listaDeAssistidos) {
            System.out.println(item.getNome());
            if (item instanceof Movie filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtistas = new LinkedList<>();
        buscaPorArtistas.add("Silverter Stalone");
        buscaPorArtistas.add("Jim Carrey");
        buscaPorArtistas.add("Nicolas Cage");
        buscaPorArtistas.add("Adam Sandler");
        System.out.println(buscaPorArtistas);

        Collections.sort(buscaPorArtistas);
        System.out.println("***Depois da alteração com o Collections.sort***");
        System.out.println(buscaPorArtistas);

        System.out.println("***Lista de Títulos ordenada***");
        Collections.sort(listaDeAssistidos);
        System.out.println(listaDeAssistidos);

        System.out.println("Ordenando por ano de lançamento");
        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLançamento));
        System.out.println(listaDeAssistidos);
    }
}
