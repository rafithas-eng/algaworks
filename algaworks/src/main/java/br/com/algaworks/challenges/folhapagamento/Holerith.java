package br.com.algaworks.challenges.folhapagamento;

import static java.lang.System.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Holerith {
    Funcionario  funcionario;
    Double valorTotalNormal;
    Double valorTotalExtra;
    Double valorTotalDependente;

    Double calculaSalario(){
      return valorTotalNormal+valorTotalExtra+valorTotalDependente;
    }
    public void exibeHolerith(Funcionario funcionario, ContratoTrabalho contratoTrabalho){
        out.println(" Funcionário :: "+funcionario.nome);
        out.println("");
        out.println(" Tem Filhos :: "+contratoTrabalho.tenFilhos);
        out.println("");
        out.println(" valor hora normal :: "+contratoTrabalho.valorNormal);
        out.println("");
        out.println(" valor hora extra :: "+contratoTrabalho.valorExtta);
        out.println("");
        out.println(" valor total hora normal :: "+this.valorTotalNormal);
        out.println("");
        out.println(" valor total hora extra :: "+this.valorTotalExtra);
        out.println("");
        out.println(" valor total  :: "+calculaSalario());
    }

}
