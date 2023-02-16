package br.com.algaworks.lessons.orientacaoobjeto;

import br.com.algaworks.content.Visitante;

public class Lesson36 {

  public static void main(String[] args) {
    Visitante visitante = Visitante.builder()
        .nome("Joao")
        .idade(19)
        .build();
    if (visitante.possuiAcessoRestritoPorIdade()){
      System.out.printf("Acesso não permitio para menores de %d anos",
                        Visitante.IDADE_MINIMA_ACESSO_IRESTRITO);
    } else {
      System.out.println("Acesso Liberado");
    }

  }

}
