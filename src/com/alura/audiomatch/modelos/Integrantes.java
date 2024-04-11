package com.alura.audiomatch.modelos;

public class Integrantes {

    private String grupo;
    private String integrantes;

    public Integrantes(String grupo, String integrantes) {

        this.grupo = grupo;
        this.integrantes = integrantes;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(String integrantes) {
        this.integrantes = integrantes;
    }
}
