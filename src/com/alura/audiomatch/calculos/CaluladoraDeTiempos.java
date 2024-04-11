package com.alura.audiomatch.calculos;

import com.alura.audiomatch.modelos.Audio;

public class CaluladoraDeTiempos {
    private int tiempoTotal;

    public void incluye(Audio audio){
        tiempoTotal += audio.getDuracion();
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }
}
