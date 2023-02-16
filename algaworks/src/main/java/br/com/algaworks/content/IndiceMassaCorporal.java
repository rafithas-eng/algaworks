package br.com.algaworks.content;

public class IndiceMassaCorporal {
  Float resultado;
  Float peso;
  Float altura;

  private Boolean estaComObesidade(){
    return  ((resultado >= 25)
      && (altura >= 152));
  }
  private Boolean estaAbaixoPesso(){
    return ((resultado <= 18)
        && (altura >= 157));
  }

}
