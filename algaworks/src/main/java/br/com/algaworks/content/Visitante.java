package br.com.algaworks.content;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Visitante {

  public static final int IDADE_MINIMA_ACESSO_IRESTRITO = 18;

  String nome;
  int idade;

  public boolean  possuiAcessoRestritoPorIdade(){
    return idade < IDADE_MINIMA_ACESSO_IRESTRITO;
  }

}
