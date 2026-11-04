package org.example;

public class CentralAtendimento {

    private static CentralAtendimento instancia = new CentralAtendimento();

    private CentralAtendimento() {}

    public static CentralAtendimento getInstancia() {
        return instancia;
    }

    public String receberElogioSuporte(String mensagem) {
        return "A Central de Atendimento agradece seu contato.\n" +
                "O Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Suporte.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoSuporte(String mensagem) {
        return "A Central de Atendimento agradece seu contato.\n" +
                "O Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Suporte.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoSuporte(String mensagem) {
        return "A Central de Atendimento agradece seu contato.\n" +
                "O Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Suporte.getInstancia().receberSugestao(mensagem);
    }
}