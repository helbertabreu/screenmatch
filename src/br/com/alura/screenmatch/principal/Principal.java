package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroDeRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Movie oExorcista = new Movie("O Exorcista", 1973);
        oExorcista.setDuracaoEmMinutos(122);

        Movie ramboProgramadoParaMatar = new Movie("Rambo - Programado para Matar", 1982);
        ramboProgramadoParaMatar.setDuracaoEmMinutos(93);

        System.out.println("Duração: " + oExorcista.getDuracaoEmMinutos() + " minutos.");

        oExorcista.exibeFichaTecnica();
        oExorcista.avalia(10);
        oExorcista.avalia(9.5);
        oExorcista.avalia(10);

        System.out.println(oExorcista.retornaMedia());

        System.out.println("Total de avaliações: " + oExorcista.getTotalDeAvaliacoes());

        Serie gameOfThrones = new Serie("Game of Thrones", 2011);
        gameOfThrones.exibeFichaTecnica();
        gameOfThrones.setTemporada(10);
        gameOfThrones.setEpisodiosPorTemporada(10);
        gameOfThrones.setMinutosPorEpisodio(56);

        System.out.println("Duração: " + gameOfThrones.getDuracaoEmMinutos() + " minutos.");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(oExorcista);
        calculadora.inclui((ramboProgramadoParaMatar));
        calculadora.inclui(gameOfThrones);
        System.out.println("Você gastará " + calculadora.getTempoTotal() + " minutos para assistir tudo.");

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        filtro.filtra(oExorcista);

        Episodio gotABatalhaDosBastardos = new Episodio();
        gotABatalhaDosBastardos.setNumero(79);
        gotABatalhaDosBastardos.setSerie(gameOfThrones);
        gotABatalhaDosBastardos.setTotalDeVisualizacoes(5935);
        filtro.filtra(gotABatalhaDosBastardos);

        var pulpFiction = new Movie("Pulp Fiction: Tempo de Violência", 1994);
        // pulpFiction.setNome("Pulp Fiction: Tempo de Violência");
        pulpFiction.setDuracaoEmMinutos(154);
        pulpFiction.avalia(10);

        ArrayList<Movie> movieList= new ArrayList<>();
        movieList.add(pulpFiction);
        movieList.add(oExorcista);
        movieList.add(ramboProgramadoParaMatar);
        System.out.println("Tamanho da lista: " + movieList.size());
        System.out.println("Primeiro filme da lista: " + movieList.get(0).getNome());
        System.out.println(movieList);
    }
}
