package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveElogiarSuporte() {
        Cliente cliente = new Cliente();
        assertEquals("A Central de Atendimento agradece seu contato.\n" +
                        "O Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O Suporte agradece a mensagem: Excelente resolução de problema",
                cliente.elogiarSuporte("Excelente resolução de problema"));
    }

    @Test
    void deveReclamarSuporte() {
        Cliente cliente = new Cliente();
        assertEquals("A Central de Atendimento agradece seu contato.\n" +
                        "O Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O Suporte vai procurar resolver a reclamação: Sistema fora do ar",
                cliente.reclamarSuporte("Sistema fora do ar"));
    }

    @Test
    void deveSugerirSuporte() {
        Cliente cliente = new Cliente();
        assertEquals("A Central de Atendimento agradece seu contato.\n" +
                        "O Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O Suporte vai analisar a sugestão: Criar chat de atendimento 24h",
                cliente.sugerirSuporte("Criar chat de atendimento 24h"));
    }
}