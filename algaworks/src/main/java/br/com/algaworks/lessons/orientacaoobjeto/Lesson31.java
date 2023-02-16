package br.com.algaworks.lessons.orientacaoobjeto;

import br.com.algaworks.content.Produto;
import br.com.algaworks.content.ServicoPercificacao;

public class Lesson31 {

  public static void main(String[] args) {

    Produto.custoEmbalagem = 20;
    double margemLucro = 20;

    Produto produtoA = Produto.builder()
        .precoCusto(60)
        .build();

    Produto produtoB = Produto.builder()
        .precoCusto(80)
        .build();

    ServicoPercificacao servicoPercificacao = new ServicoPercificacao();
    servicoPercificacao.definirPrecoVendaComEmbalagem(produtoA,margemLucro);
    servicoPercificacao.definirPrecoVendaComEmbalagem(produtoB,margemLucro);

    System.out.printf("Preço de custo Produto A: %.2f%n", produtoA.getPrecoCusto());
    System.out.printf("Preço de venda Produto A: %.2f%n", produtoA.getPrecoVenda());

    System.out.printf("Preço de custo Produto B: %.2f%n", produtoB.getPrecoCusto());
    System.out.printf("Preço de venda Produto B: %.2f%n", produtoB.getPrecoVenda());

  }
}
