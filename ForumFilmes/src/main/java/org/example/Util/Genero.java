package org.example.Util;

import java.util.ArrayList;
import java.util.List;

public class Genero {
    private String nomeGenero;
    private List<Conteudo> conteudos;

    public Genero(String nomeGenero) {
        this.nomeGenero = nomeGenero;
        this.conteudos = new ArrayList<>();
    }

    public String getNomeGenero() {
        return nomeGenero;
    }

    public void adicionarConteudo(Conteudo conteudo){
        if (!conteudos.contains(conteudo)){
            conteudos.add(conteudo);
            System.out.println(conteudo.getTitulo() + " adicionado a: " + nomeGenero);
        }
    }

    public void listarConteudo() {
        System.out.print(nomeGenero + ":");
        for (Conteudo c : conteudos) {
            System.out.print(c.getTitulo() + "\n");
        }
    }
}