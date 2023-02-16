package br.com.algaworks.lessons.orientacaoobjeto;

import br.com.algaworks.content.Aeronave;

public class Lesson27
{

  public static void main(String[] args) {
    Aeronave aeronave = Aeronave.builder()
        .totalAssentos(100).build();

    //aeronave.desativar();
    aeronave.reservaAssentos(10);
    System.out.printf("GOL (%s): %d assentos disponiveis%n",
                      aeronave.isAtivo()?"Ativo":"Inativo",
                      aeronave.calcularAssentosDisponiveis());

  }

}
