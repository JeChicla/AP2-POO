package org.example.Util;

import java.util.Date;

public class Serie extends Conteudo{
    private int episodios;
    public Serie(String titulo, int lancamento, int episodios) {
        super(titulo, lancamento);
        this.episodios = episodios;
    }

    @Override
    public String getTitulo() {
        return super.getTitulo();
    }

    @Override
    public int getLancamento() {
        return super.getLancamento();
    }

    @Override
    public void exibirInfo() {
        System.out.println("Filme: " + titulo + " Lançamento: " + lancamento
                + " Episodios: " + episodios);
    }
}
