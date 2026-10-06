import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Filme;

public class Main{
    public static void main(String[] args){
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1978);
        meuFilme.setDuracaoEmMinutos(180);

    //alimentando objeto com dados
        meuFilme.avalia(10);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        meuFilme.exibeFichaTecnica();

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro. filtra(meuFilme);
    }
}