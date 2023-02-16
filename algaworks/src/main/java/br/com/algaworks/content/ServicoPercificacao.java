package br.com.algaworks.content;

public class ServicoPercificacao {
  public void definirPrecoVenda(Produto produto, double percentualMargemVenda){
    produto.precoVenda = produto.precoCusto * ((percentualMargemVenda/100)+1);

  }

  public void calcularPrecoVenda(double precoVenda){
    precoVenda = precoVenda * 1.20;

  }

  public void definirPrecoVendaComEmbalagem(Produto produto, double percentualMargemVenda){
    double precoVendaCalculado = Matematica.calcularAcrescimo(produto.precoCusto,percentualMargemVenda);
    precoVendaCalculado += Produto.custoEmbalagem;
    produto.precoVenda = precoVendaCalculado;

  }

}
