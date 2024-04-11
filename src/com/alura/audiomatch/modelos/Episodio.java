package com.alura.audiomatch.modelos;

import com.alura.audiomatch.calculos.Clasificable;

public class Episodio implements Clasificable {
    private String nombre;
    private Podcasts podcasts;
    private int minutosDuracion;
    private Integrantes integrantes;
    private int numero;
    private int reproducciones;
    private int temporada;

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Podcasts getPodcasts() {
        return podcasts;
    }

    public void setPodcasts(Podcasts podcasts) {
        this.podcasts = podcasts;
    }

    public int getMinutosDuracion() {
        return minutosDuracion;
    }

    public void setMinutosDuracion(int minutosDuracion) {
        this.minutosDuracion = minutosDuracion;
        sumaMinutos();
    }

    public Integrantes getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(String grupo, String integrantes) {
        this.integrantes = new Integrantes(grupo, integrantes);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void sumaMinutos(){
        podcasts.setDuracion(minutosDuracion);
    }

    public void muestraFichaTecnica(){
        String ficha = """                
                Podcast: %s
                Nombre de episodio: %s
                Número de episodio: %d
                Duración de episodio: %d
                Locutores e invitados: %s
                Temporada: %d
                """.formatted(podcasts.getTitulo(), nombre, numero, minutosDuracion, integrantes.getIntegrantes(), temporada);
        System.out.println(ficha);
    }

    @Override
    public int getClasificable() {
        return reproducciones > 1000 ? 1 : 2;
    }
}
