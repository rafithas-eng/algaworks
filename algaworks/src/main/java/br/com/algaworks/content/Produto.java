package br.com.algaworks.content;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Produto {

  public static double custoEmbalagem;

  double precoCusto;
  double precoVenda;


  public void alterarPrecoCusto(double precoCusto){
    this.precoCusto = precoCusto;

  }

  public static double calcularCustosTotais(Produto produto){
    return produto.precoCusto + Produto.custoEmbalagem;

  }
  public static  void imprimirCustoEmbalagem(){
    System.out.printf("Custo com embalagem: %.2f%n",Produto.custoEmbalagem);
  }
  public static void alterarCustoEmbalagem(double custoEmbalagem){
    Produto.custoEmbalagem = custoEmbalagem;
  }

}
