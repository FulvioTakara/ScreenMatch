import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main{
    public static void main(String[] args){
        Filme filme1 = new Filme();
        filme1.setNome("O poderoso chefão");
        filme1.setAnoDeLancamento(1978);
        filme1.setDuracaoEmMinutos(180);
        filme1.setDiretor("Francis Ford Coppola");

        Filme filme2 = new Filme();
        filme2.setNome("Velozes e furiosos");
        filme2.setAnoDeLancamento(2001);
        filme2.setDuracaoEmMinutos(120);
        filme2.setDiretor("Rob Cohen");

        Serie serie1 = new Serie();
        serie1.setNome("O Mentalista");
        serie1.setAnoDeLancamento(2008);
        serie1.setTemporadas(7);
        serie1.setEpisodiosPorTemporada(23);
        serie1.setMinutosPorEpisodio(50);

    //alimentando objeto com dados
        filme1.avalia(10);
        filme1.avalia(9);
        filme1.avalia(10);
        filme2.avalia(10);
        filme2.avalia(10);
        filme2.avalia(10);
        serie1.avalia(10);
        serie1.avalia(9);
        serie1.avalia(8);

        filme1.exibeFichaTecnica();
        filme2.exibeFichaTecnica();
        serie1.exibeFichaTecnica();
        System.out.println("Duração para maratonar é " + serie1.getDuracaoEmMinutos());

        //Aplicando calculadora
       CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
       calculadora.inclui(filme1);
       calculadora.inclui(filme2);
       calculadora.inclui(serie1);
       System.out.println(calculadora.getTempoTotal());

       //Aplicando o filtro de recomendação
       FiltroRecomendacao filtro = new FiltroRecomendacao();
       filtro.filtra(filme1);
       filtro.filtra(filme2);
    }
}