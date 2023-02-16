package br.com.algaworks.lessons.orientacaoobjeto;

import br.com.algaworks.content.CadastroPortaria;
import br.com.algaworks.content.Visitante;

public class Lesson38 {

  public static void main(String[] args) {
    Visitante novoVisitante = Visitante.builder()
        .nome("João")
        .idade(15)
        .build();
    CadastroPortaria cadastroPortaria = new CadastroPortaria();
    cadastroPortaria.cadastrar(novoVisitante,10);
    cadastroPortaria.cadastrar(novoVisitante);
  }
}
