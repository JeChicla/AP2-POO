package org.example.Util;



public class Filme extends Conteudo{
    private int duracao;

    public Filme(String titulo, int lancamento, int duracao) {
        super(titulo, lancamento);
        this.duracao = duracao;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Filme: " + titulo + " Lançamento: " + lancamento
        + " Duração: " + duracao);
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
