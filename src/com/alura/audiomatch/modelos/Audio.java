package com.alura.audiomatch.modelos;

public class Audio {
    String titulo;
    String autor;
    private int fechaLanzamiento;
    private double sumaNotas;
    private int totalNotas;
    private int duracion;

    private boolean plan;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public double getValoracion() {
        return sumaNotas;
    }

    public void setValoracion(int valoracion) {
        this.sumaNotas = valoracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion += duracion;
    }

    public boolean isPlan() {
        return plan;
    }

    public void setPlan(boolean plan) {
        this.plan = plan;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void muestraFichaTecnica() {
        String ficha = """
                Título: %s
                Fecha: %d
                Duración Total: %d minutos.""".formatted(titulo, fechaLanzamiento, duracion);
        System.out.println(ficha);
        getEstrellas();
    }

    public void valorar(double nota) {
        sumaNotas += nota;
        totalNotas++;
    }

    public double mediaNotas() {
        return sumaNotas / totalNotas;
    }

    public void getEstrellas(){
        System.out.println("Estrellas: " + (int) (mediaNotas() / 2) + " ");
    }

}


