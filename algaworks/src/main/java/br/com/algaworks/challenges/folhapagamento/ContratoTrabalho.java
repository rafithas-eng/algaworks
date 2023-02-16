package br.com.algaworks.challenges.folhapagamento;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ContratoTrabalho {

  Funcionario funcionario;
  Double valorNormal;
  Double valorExtta;

  Boolean tenFilhos;


}