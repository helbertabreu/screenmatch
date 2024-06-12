package br.com.alura.screenmatch.calculos;

public class FiltroDeRecomendacao {

    public void filtra(Classificacao classificacao){
        if (classificacao.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos da galera!");
        } else if (classificacao.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado!");
        } else {
            System.out.println("Inclua na sua lista para assistir mais tarde!");
        }
    }
}
