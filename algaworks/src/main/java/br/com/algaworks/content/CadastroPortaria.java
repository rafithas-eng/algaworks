package br.com.algaworks.content;

public class CadastroPortaria {


  public static final int TEMPO_EXPIRACAO_PADRAO = 1;

  public void cadastrar(Visitante visitante, int tempoExpiracao){
    final int tempoExpiracaoEmDias = tempoExpiracao * 30;
    System.out.printf("Visitante %s cadastrado para %d dias%n",
                      visitante.nome,
                      tempoExpiracaoEmDias);
  }

  public void cadastrar(Visitante visitante){
    this.cadastrar(visitante, TEMPO_EXPIRACAO_PADRAO);
  }
}
