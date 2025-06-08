package org.example.Util;
import java.util.ArrayList;
import java.util.Collection;

public class Review {
    private Collection<Usuario> autores; // utilizando Collections
    private Conteudo conteudo;
    private float nota;
    private String titulo;
    private String comentario;
    private static  Collection<Review> colecaoReviews = new ArrayList<>();
    /*
    Criando uma lista estatica fora do constructor para que seja um atributo da classe e nao
    da instancia
     */

    public Review(Collection<Usuario> autores, Conteudo conteudo,
                  float nota, String titulo, String comentario) {
        this.autores = autores;
        this.conteudo = conteudo;
        this.nota = nota;
        this.titulo = titulo;
        this.comentario = comentario;
    }

    public float getNota() {
        return nota;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getComentario() {
        return comentario;
    }
    public static void exibirTodasReviews() {
        for (Review r : colecaoReviews) {
            r.exibirReview();
        }
    }

    public void exibirReview(){
        System.out.print("Autores: ");
        for (Usuario autor : autores) {
            System.out.print(autor.getNome() + " ");
            }
        System.out.println("Título: " + titulo);
        System.out.println("Nota: " + nota);
        System.out.println("Comentário: " + comentario);
        System.out.println("Conteúdo: " + conteudo.getTitulo());
        }

}






