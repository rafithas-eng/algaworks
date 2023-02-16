package br.com.algaworks.content;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Aeronave {
  @Builder.Default
  boolean ativo = true;
  int totalAssentos;

  int assentosReservados;

  public int calcularAssentosDisponiveis(){
    return totalAssentos - assentosReservados;
  }

  public void reservaAssentos(int numeroAssentos){
    if (ativo){
      assentosReservados  += numeroAssentos;
    }else{
      System.out.println("Aeronave Desativada. Assentos não reservados.");
    }
  }

  public void desativar(){
    ativo = false;
  }

  public void ativar(){
    ativo = true;
  }
}
