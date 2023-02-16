package br.com.algaworks.challenges.folhapagamento;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Funcionario {

  String nome;
  Integer qtdFilhos;

}