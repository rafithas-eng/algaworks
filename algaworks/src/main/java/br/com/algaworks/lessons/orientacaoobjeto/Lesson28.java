package br.com.algaworks.lessons.orientacaoobjeto;

import br.com.algaworks.content.ServicoPercificacao;

public class Lesson28 {

  public static void main(String[] args) {
    double precoCompraFornecedor = 140;

    ServicoPercificacao servicoPercificacao = new ServicoPercificacao();
    servicoPercificacao.calcularPrecoVenda(precoCompraFornecedor);
    System.out.printf("Preço : %.2f%n", precoCompraFornecedor);
  }

}
