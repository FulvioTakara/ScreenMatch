package br.com.alura.screenmatch.modelos;

public class Titulo{
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private int duracaoEmMinutos;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    // Getts
    public int getTotalDeAvaliacoes(){

        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    // Criando métodos para as classes
    public void exibeFichaTecnica() {
        System.out.println(String.format("""
                        Filme: %s
                        Ano de lançamento: %d
                        Duração: %d minutos
                        Avaliações: %d
                        Estrelas: %.1f""",
                nome, anoDeLancamento, duracaoEmMinutos, getTotalDeAvaliacoes(), pegaMedia()
        ));
    }

    // Somando as avaliações e contando a quantidade de avaliações feitas
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    //Calculando a média das avaliações
    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
