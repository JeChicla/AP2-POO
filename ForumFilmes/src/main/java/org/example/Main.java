package org.example;
import org.example.Util.Genero;
import org.example.Util.Serie;
import org.example.Util.Usuario;
import org.example.Util.Filme;

public class Main {
    public static void main(String[] args) {
        Usuario joao = new Usuario("João");
        Usuario maria = new Usuario("Maria");
        Usuario valen = new Usuario("Valen");
        Usuario homura = new Usuario("Homura");

        Filme matrix = new Filme("Matrix", 1999, 120);
        Serie madoka = new Serie("Madoka", 2011,12);

        Genero ficcao = new Genero("Ficção Científica");
        Genero acao = new Genero("Ação");
        Genero fantasia = new Genero("Fantasia");
        
        homura.adicionarFilme("Rebelion",2014,110);

        homura.seguirUsuario(valen);
        valen.listarSeguidores();

        homura.escreverReview(madoka,10.0f,"peak","absolute cinema");
        homura.exibirReviews();
        fantasia.adicionarConteudo(madoka);
        fantasia.listarConteudo();

        





    }
}