package br.com.algaworks.lessons.orientacaoobjeto;

import br.com.algaworks.challenges.numeros.NumeroUtil;

public class Lesson41 {
  public static void main(String[] args) {
    Integer primeiroInteger = 10;
    Integer seguntoInteger = 20;
    Integer terceiroInteger = 30;

    Double primeiroDouble = 10.5;
    Double seguntoDouble = 20.25;
    Double terceiroDouble = 30.55;

    System.out.printf("Maior numero entre %d e %d, é : %d%n",
                      primeiroInteger,
                      seguntoInteger,
                      NumeroUtil.maiorNumero(primeiroInteger, seguntoInteger));

    System.out.printf("Maior numero entre %d, %d e %d, é : %d%n",
                      primeiroInteger,
                      seguntoInteger,
                      terceiroInteger,
                      NumeroUtil.maiorNumero(primeiroInteger, seguntoInteger, terceiroInteger));


    System.out.printf("Maior numero entre %.2f e %.2f, é : %.2f%n",
                      primeiroDouble,
                      seguntoDouble,
                      NumeroUtil.maiorNumero(primeiroDouble, seguntoDouble));

    System.out.printf("Maior numero entre %.2f, %.2f e %.2f, é : %.2f%n",
                      primeiroDouble,
                      seguntoDouble,
                      terceiroDouble,
                      NumeroUtil.maiorNumero(primeiroDouble, seguntoDouble, terceiroDouble));


  }
}
