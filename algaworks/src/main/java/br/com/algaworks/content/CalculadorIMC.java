package br.com.algaworks.content;

public class CalculadorIMC {
  IndiceMassaCorporal calcular(Paciente paciente){
    IndiceMassaCorporal imc = new IndiceMassaCorporal();
    imc.resultado = paciente.peso / (paciente.altura * paciente.altura);
    imc .peso = paciente.peso;
    imc.altura = paciente.altura;
    return imc;
  }

}
