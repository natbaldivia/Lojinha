package br.com.lojinha;

import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto();

        meuProduto.setNome("Playstation 4");
        meuProduto.setValor(2000.00);
        meuProduto.setMarca("Sony");
        meuProduto.setTamanho("médio");

        List<String> itensInclusos = new ArrayList<>();
        itensInclusos.add("2 controles");
        itensInclusos.add("3 jogos");
        itensInclusos.add("2 Cabos de Energia");
        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getItensInclusos().size());

        System.out.println(meuProduto.getValor());
    }
}
