package com.aluracursos.desafioaudio.modelo;

public class Podcast extends Audio{

    private String presentador;
    private String descripcion;

    public String getPresentador() {git
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
