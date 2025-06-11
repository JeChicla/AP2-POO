package org.example.Util;
import java.util.ArrayList;
import java.util.List;

public abstract class Conteudo {
    protected String titulo;
    protected int lancamento;
    protected List<Genero> generos;
    protected String diretor;
    protected int classificacao;

    public Conteudo(String titulo, int lancamento, String diretor, int classificacao) {
        this.titulo = titulo;
        this.lancamento = lancamento;
        this.generos = new ArrayList<>();
        this.diretor = diretor;
        if (classificacao == 0 ||classificacao == 10 ||classificacao == 12 ||classificacao == 14 ||classificacao == 16||classificacao == 18) {
            this.classificacao = classificacao;}
    }
//Metodos que serao obrigatorios para os Conteudos;

    public abstract void exibirInfo();

    public String getTitulo() {
        return titulo;
    }

    public int getLancamento() {
        return lancamento;
    }

    public String getDiretor() { return diretor; }

    public int getClassificacao() { return classificacao; }


    public void adicionarGenero(Genero genero){
        if (!generos.contains(genero)){
            generos.add(genero);
            genero.adicionarConteudo(this);
        }
    }
    public void listarGeneros() {
        System.out.println(titulo + ":");
        for (Genero g : generos) {
            System.out.println(g.getNomeGenero());
        }
    }


}
