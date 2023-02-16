package br.com.algaworks.challenges.numeros;

public class NumeroUtil {
  public static Integer maiorNumero(final Integer primeiro, final Integer segundo){
    return primeiro > segundo ? primeiro : segundo;
  }
  public static Integer maiorNumero(final Integer primeiro, final Integer segundo, final Integer terceiro){
    var maior = NumeroUtil.maiorNumero(primeiro,segundo);
    return terceiro > maior ? terceiro : maior;
  }

  public static Double maiorNumero(final Double primeiro, final Double segundo){
    return primeiro > segundo ? primeiro : segundo;
  }
  public static Double maiorNumero(final Double primeiro, final Double segundo, final Double terceiro){
    var maior = NumeroUtil.maiorNumero(primeiro,segundo);
    return terceiro > maior ? terceiro : maior;
  }

}
