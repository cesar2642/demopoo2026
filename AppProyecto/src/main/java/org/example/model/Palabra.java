package org.example.model;

import java.io.Serializable;

public class Palabra implements Serializable {

    private String idioma;
    private String palabra;
    private String significado;
    private String ejemplo;
    private String categoria;



    public Palabra() {
    }

    public Palabra(String idioma, String palabra, String significado, String ejemplo, String categoria) {
        this.idioma = idioma;
        this.palabra = palabra;
        this.significado = significado;
        this.ejemplo = ejemplo;
        this.categoria = categoria;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getSignificado() {
        return significado;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }

    public String getEjemplo() {
        return ejemplo;
    }

    public void setEjemplo(String ejemplo) {
        this.ejemplo = ejemplo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Palabra{" +
                "idioma='" + idioma + '\'' +
                ", palabra='" + palabra + '\'' +
                ", significado='" + significado + '\'' +
                ", ejemplo='" + ejemplo + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
