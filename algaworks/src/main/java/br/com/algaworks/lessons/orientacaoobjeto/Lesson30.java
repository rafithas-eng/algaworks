package br.com.algaworks.lessons.orientacaoobjeto;

import br.com.algaworks.content.Produto;
import br.com.algaworks.content.ServicoPercificacao;

public class Lesson30 {

  public static void main(String[] args) {
    double precoCustoNovo = 180;
    double margemLucro = 80;
    Produto produto = Produto.builder()
        .precoCusto(100)
        .build();

    produto.alterarPrecoCusto(precoCustoNovo);
    ServicoPercificacao servicoPercificacao = new ServicoPercificacao();
    servicoPercificacao.definirPrecoVenda(produto,margemLucro);

    System.out.printf("Preço de custo: %.2f%n", produto.getPrecoCusto());
    System.out.printf("Preço de venda: %.2f%n", produto.getPrecoVenda());
  }

}
