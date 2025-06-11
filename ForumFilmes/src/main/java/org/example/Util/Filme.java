package org.example.Util;


public class Filme extends Conteudo {
    private int duracao;

    public Filme(String titulo, int lancamento, String diretor, int classificacao, int duracao) {
        super(titulo, lancamento, diretor, classificacao);
        this.duracao = duracao;
    }

    @Override
    public void exibirInfo() {
        System.out.print("Filme: " + titulo + "\n" + "Lançamento: " + lancamento + "\n" + "Diretor: " + diretor + "\n" + "Classificação indicativa: " + classificacao + "\n" + "Duração: " + duracao + "\n");
    }

    @Override
    public String getTitulo() {
        return super.getTitulo();
    }

    @Override
    public int getLancamento() {
        return super.getLancamento();
    }
}


