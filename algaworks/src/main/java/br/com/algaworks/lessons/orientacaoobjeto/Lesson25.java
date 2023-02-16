package br.com.algaworks.lessons.orientacaoobjeto;

import br.com.algaworks.challenges.folhapagamento.ContratoTrabalho;
import br.com.algaworks.challenges.folhapagamento.FolhaPagamento;
import br.com.algaworks.challenges.folhapagamento.Funcionario;
import br.com.algaworks.challenges.folhapagamento.Holerith;
import java.io.IOException;
import java.io.InputStream;
import org.json.simple.parser.ParseException;


public class Lesson25 {

  private ContratoTrabalho contratoTrabalho;
  private FolhaPagamento folhaPagamento;

  private Funcionario funcionario;
  private Holerith holerith;

  public static void main(String[] args) throws IOException, ParseException {

    Lesson25 instance = new Lesson25();

    var is = instance.getFileAsIOStream ("funcionarios.json");

    mappertoFile(is,instance);
  }

  private InputStream getFileAsIOStream(final String fileName)
  {
    InputStream ioStream = this.getClass()
        .getClassLoader()
        .getResourceAsStream(fileName);

    if (ioStream == null) {
      throw new IllegalArgumentException(fileName + " is not found");
    }
    return ioStream;
  }
  private static void mappertoFile(InputStream is, Lesson25 instance)
      throws IOException, ParseException {
    ClassLoader classLoader = Lesson25.class.getClassLoader();

/*
    FileReader in = classLoader.getResourceAsStream("resources").;

    JSONParser jsonParser = new JSONParser();
    JSONObject jo = (JSONObject)jsonParser.parse(new FileReader(in), StandardCharsets.UTF_8));
    List<ContratoTrabalho> contratoTrabalhos = List.of( (ContratoTrabalho) jo.get("ContratoTrabalho"));
    List<Double>  horasTrabalhadas = List.of((Double) jo.get("HorasTrabalhadas"));
    List<Double>  horasExtras = List.of((Double) jo.get("HorasExtras"));
    final int[] i = {0};

    contratoTrabalhos.forEach(contratoTrabalho -> {
      instance.funcionario = Funcionario.builder()
          .nome(contratoTrabalho.getFuncionario().getNome())
          .qtdFilhos(contratoTrabalho.getFuncionario().getQtdFilhos())
          .build();
      instance.contratoTrabalho = ContratoTrabalho.builder()
          .funcionario(instance.funcionario)
          .valorExtta(contratoTrabalho.getValorExtta())
          .valorNormal(contratoTrabalho.getValorNormal())
          .tenFilhos(contratoTrabalho.getTenFilhos())
          .build();
      instance.holerith = FolhaPagamento.calcularSalario(horasTrabalhadas.get(i[0]),
                                                         horasTrabalhadas.get(i[0]),
                                                         instance.contratoTrabalho);
      instance.holerith.exibeHolerith(instance.funcionario, instance.contratoTrabalho);
      i[0]++;


    });*/
  }
}