package org.example;
import org.example.Util.Genero;
import org.example.Util.Serie;
import org.example.Util.Usuario;
import org.example.Util.Filme;

public class Main {
    public static void main(String[] args) {
        Usuario joao = new Usuario("joao12345");
        Usuario maria = new Usuario("maria02");
        Usuario valen = new Usuario("valen1");
        Usuario homura = new Usuario("homura_akemi");

        Filme matrix = new Filme("Matrix", 1999, "Diretor", 10, 120);
        Serie madoka = new Serie("Madoka", 2011, "Diretor2", 14, 12);

        Genero ficcao = new Genero("Ficção Científica");
        Genero acao = new Genero("Ação");
        Genero fantasia = new Genero("Fantasia");


        homura.seguirUsuario(valen);
        valen.listarSeguidores();

        homura.exibirReviewsUsuario();
        fantasia.adicionarConteudo(madoka);
        fantasia.listarConteudo();

        madoka.exibirInfo();
    }





    }
}