package br.com.algaworks.lessons.orientacaoobjeto;

import br.com.algaworks.content.Produto;
import br.com.algaworks.content.ServicoPercificacao;

public class Lesson29 {

  public static void main(String[] args) {
    double margemLucro = 80;
    Produto produto = Produto.builder()
        .precoCusto(100)
        .build();

    ServicoPercificacao servicoPercificacao = new ServicoPercificacao();
    servicoPercificacao.definirPrecoVenda(produto,margemLucro);
    System.out.printf("Preço de venda: %.2f%n", produto.getPrecoVenda());
  }
}
