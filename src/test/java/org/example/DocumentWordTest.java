package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DocumentWordTest {

    @Test
    void deveCriarNovoDocumentoWord() {
        Document document = DocumentFactory.obterDocumento("Word");
        assertEquals("Novo documento de word criado", document.New());
    }

    @Test
    void deveAbrirDocumentoWord() {
        Document document = DocumentFactory.obterDocumento("Word");
        assertEquals("Documento de word aberto com sucesso", document.Open());
    }

    @Test
    void deveSalvarDocumentoWord() {
        Document document = DocumentFactory.obterDocumento("Word");
        assertEquals("Documento de word salvo", document.Save());
    }

}
