package org.example;

public class DocumentFactory {
    public static Document obterDocumento(String documento){
        Class classe = null;
        Object objeto = null;

        try{
            classe = Class.forName("org.example.Document" + documento);
            objeto = classe.newInstance();
        } catch (Exception ex){
            throw new IllegalArgumentException("Documento inexistente");
        }
        if (!(objeto instanceof Document)) {
            throw new IllegalArgumentException("Documento inválido");
        }
        return (Document) objeto;
    }
}
