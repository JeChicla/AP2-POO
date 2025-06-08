package org.example.Util;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Conteudo {
    protected String titulo;
    protected int lancamento;
    protected List<Genero> generos;

    public Conteudo(String titulo, int lancamento) {
        this.titulo = titulo;
        this.lancamento = lancamento;
        this.generos = new ArrayList<>();
    }
//Metodos que serao obrigatorios para os Conteudos;

    public abstract void exibirInfo();

    public String getTitulo() {
        return titulo;
    }

    public int getLancamento() {
        return lancamento;
    }

    public void adicioarGenero(Genero genero){
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
