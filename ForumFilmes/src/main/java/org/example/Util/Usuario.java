package org.example.Util;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Usuario {
    private String username;
    private List<Conteudo> conteudoAdicionado;
    private Collection<Review> reviews = new ArrayList<>();
    private List<Conteudo> favoritos;
    private List<Usuario> seguidores;
    private List<Usuario> seguindo;

    public Usuario(String username) {
        this.username = username;
        this.conteudoAdicionado = new ArrayList<>();
        this.favoritos = new ArrayList<>();
        this.seguidores = new ArrayList<>();
        this.seguindo = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void exibirReviewsUsuario() {
        System.out.println("reviews:");
        for (Review r : reviews){
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
            System.out.print("seguindo: " + u.getUsername() + "\n");
        }
        else {
            System.out.println("Operação invalida");
        }
    }

    public void listarSeguidores() {
        System.out.print("Seguidores: ");
        for (Usuario u : seguidores) {
            System.out.print(u.getUsername() + "\n");
            }
    }

    public void listarSeguindo() {
        System.out.println("Seguindo:");
        for (Usuario u : seguindo) {
            System.out.println(u.getUsername() + "\n");
        }
    }


}
