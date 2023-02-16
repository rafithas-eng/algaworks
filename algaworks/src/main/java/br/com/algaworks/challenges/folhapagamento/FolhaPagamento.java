package br.com.algaworks.challenges.folhapagamento;

public class FolhaPagamento {

    private static Holerith holerithCalculado;

    public static Holerith calcularSalario(Double horasTrabalhadas, Double  horasExtras, ContratoTrabalho contratoTrabalho) {


        if (horasTrabalhadas>0){
            holerithCalculado.funcionario = contratoTrabalho.funcionario;

            holerithCalculado.valorTotalNormal = horasTrabalhadas * contratoTrabalho.valorNormal;
            if (horasExtras > 0  && contratoTrabalho.valorExtta  > 0) {
                holerithCalculado.valorTotalExtra = horasExtras * contratoTrabalho.valorExtta;
            }
            if (contratoTrabalho.tenFilhos){
                holerithCalculado.valorTotalDependente =
                    (holerithCalculado.valorTotalNormal + contratoTrabalho.valorExtta)*0.1;
            }
        }

        return holerithCalculado;
    }
}