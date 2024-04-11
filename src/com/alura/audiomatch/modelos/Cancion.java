package com.alura.audiomatch.modelos;

import com.alura.audiomatch.calculos.Clasificable;

public class Cancion extends Audio implements Clasificable {

    private String genero;
    private String album;
    private String interprete;
    private Integrantes integrantes;
    private int pista;
    private int totalReproducciones;

    public int getTotalReproducciones() {
        return totalReproducciones;
    }

    public void setTotalReproducciones(int totalReproducciones) {
        this.totalReproducciones += totalReproducciones;
    }

    public int getPista() {
        return pista;
    }

    public void setPista(int pista) {
        this.pista = pista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public Integrantes getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(Integrantes integrantes) {
        this.integrantes = integrantes;
    }

    @Override
    public int getClasificable() {
        return totalReproducciones > 10000 ? 1 : 2;
    }

    @Override
    public void muestraFichaTecnica() {
        String ficha = """
                Género: %s
                Álbum: %s
                Intérprete: %s
                Pista: %d
                """.formatted(genero, album, !integrantes.getIntegrantes().equals("") ? integrantes.getIntegrantes() : integrantes.getGrupo(), pista);
        super.muestraFichaTecnica();
        System.out.println(ficha);
    }
}
