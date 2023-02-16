package br.com.algaworks.lessons.orientacaoobjeto;

import br.com.algaworks.content.Produto;

public class Lesson34 {

  public static void main(String[] args) {
    Produto.alterarCustoEmbalagem(10);

    Produto produto = Produto.builder()
        .precoCusto(100)
        .build();

    produto.alterarPrecoCusto(100);

    System.out.printf("Total de custos: %.2f%n",
                      Produto.calcularCustosTotais(produto));
  }

}
