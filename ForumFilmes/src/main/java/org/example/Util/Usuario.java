package org.example.Util;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class Usuario {
    private String nome;
    private List<Conteudo> conteudoAdicionado;
    private List<Review> reviews;
    private List<Conteudo> favoritos;
    private List<Usuario> seguidores;
    private List<Usuario> seguindo;

    public Usuario(String nome) {
        this.nome = nome;
        this.conteudoAdicionado = new ArrayList<>();
        this.reviews = new ArrayList<>();
        this.favoritos = new ArrayList<>();
        this.seguidores = new ArrayList<>();
        this.seguindo = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarFilme(String titulo, int lancamento, int duracao) {
        Filme filme = new Filme(titulo,lancamento,duracao);
        System.out.println("filme:" + filme.getTitulo());
    }
    public void adicionarSerie(String titulo, int lancamento, int episodios) {
        Serie serie = new Serie(titulo,lancamento,episodios);
        System.out.println("serie:" + serie.getTitulo());
    }

    public void escreverReview(Conteudo conteudo, float nota, String titulo, String comentario) {
        Review review = new Review(Collections.singleton(this), conteudo, nota, titulo, comentario);
        reviews.add(review);
    }

    public void exibirReviews() {
        System.out.println("reviews:");
        for (Review r : reviews)  /*
             For (Objeto <instancia> : lista) ou seja, para cada
             objeto do tipo <instancia> contido na lista "lista".
             tem bastantes desses for in range no codigo.
            */ {
            System.out.println("Titulo: "+ r.getTitulo());
            System.out.println("Nota: " + r.getNota());
            System.out.println("Comentario: " + r.getComentario());
        }
    }

    public void adicionarFavorito(Conteudo conteudo) {
        if (!favoritos.contains(conteudo)) {
            favoritos.add(conteudo);
        }
    }
    public void listarFavoritos() {
        System.out.println("Favoritos");
        for (Conteudo c : favoritos) {
            c.exibirInfo();
            System.out.println(c.getTitulo());
        }
    }

    public void seguirUsuario(Usuario u) {
        if (!seguindo.contains(u)) {
            seguindo.add(u);
            u.seguidores.add(this);
            System.out.println("seguindo á:" + u.getNome());
        }
        else {
            System.out.println("Operação invalida");
        }
    }

    public void listarSeguidores() {
        System.out.println("Seguidores:");
        for (Usuario u : seguidores) {
            System.out.println(u.getNome());
            }
    }

    public void listarSeguindo() {
        System.out.println("Seguindo:");
        for (Usuario u : seguindo) {
            System.out.println(u.getNome());
        }
    }


}
