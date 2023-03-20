package org.example;

import org.junit.jupiter.api.Test;

import javax.print.Doc;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentFactoryTest {
    @Test
    void deveRetornarExcecaoParaDocumentoInexistente(){
        try{
            Document documento = DocumentFactory.obterDocumento("Certidao");
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Documento inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido(){
        try{
            Document documento = DocumentFactory.obterDocumento("Doc");
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Documento inválido", e.getMessage());
        }
    }
}
