package br.com.algaworks.lessons.orientacaoobjeto;

import br.com.algaworks.content.Produto;
import br.com.algaworks.content.ServicoPercificacao;

public class Lesson32 {

  public static void main(String[] args) {

    double margemLucro = 20;

    Produto produtoA = Produto.builder()
        .precoCusto(60)
        .build();

    produtoA.alterarCustoEmbalagem(10);

    Produto produtoB = Produto.builder()
        .precoCusto(80)
        .build();

    produtoB.alterarCustoEmbalagem(20);

    produtoA.imprimirCustoEmbalagem();
    produtoB.imprimirCustoEmbalagem();

    ServicoPercificacao servicoPercificacao = new ServicoPercificacao();
    servicoPercificacao.definirPrecoVendaComEmbalagem(produtoA,margemLucro);
    servicoPercificacao.definirPrecoVendaComEmbalagem(produtoB,margemLucro);

    System.out.printf("Preço de custo Produto A: %.2f%n", produtoA.getPrecoCusto());
    System.out.printf("Preço de venda Produto A: %.2f%n", produtoA.getPrecoVenda());

    System.out.printf("Preço de custo Produto B: %.2f%n", produtoB.getPrecoCusto());
    System.out.printf("Preço de venda Produto B: %.2f%n", produtoB.getPrecoVenda());

    produtoB.imprimirCustoEmbalagem();

  }

}
