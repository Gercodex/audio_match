package com.alura.audiomatch.modelos;

public class Podcasts extends Audio{

    private int temporadas;
    private boolean suscripcion;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public void muestraFichaTecnica(){
        super.muestraFichaTecnica();
        System.out.println("Temporadas: "+temporadas);
    }

}
