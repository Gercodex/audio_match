package com.alura.audiomatch;

import com.alura.audiomatch.calculos.CaluladoraDeTiempos;
import com.alura.audiomatch.calculos.Ranking;
import com.alura.audiomatch.modelos.Cancion;
import com.alura.audiomatch.modelos.Episodio;
import com.alura.audiomatch.modelos.Integrantes;
import com.alura.audiomatch.modelos.Podcasts;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Audiomatch \n");
        Podcasts unPodcast = new Podcasts();
        unPodcast.setTitulo("Viajes por el mundo.");
        unPodcast.setAutor("webR_dio");
        unPodcast.setFechaLanzamiento(2021);
        unPodcast.setTemporadas(1);
        unPodcast.setPlan(false);
        unPodcast.valorar(8.5);
        unPodcast.valorar(9.7);
        unPodcast.valorar(6.8);

        Episodio episodio1 = new Episodio();
        episodio1.setPodcasts(unPodcast);
        episodio1.setIntegrantes("Expertos en traveling", "Miguel, Jeff, Mary, Marco");
        episodio1.setNumero(1);
        episodio1.setMinutosDuracion(30);
        episodio1.setNombre("¿Destinos recomendados?");
        episodio1.setTemporada(1);
        episodio1.setReproducciones(201);

        Ranking ranking = new Ranking();
        ranking.muestraRanking(episodio1);

        Episodio episodio2 = new Episodio();
        episodio2.setPodcasts(unPodcast);
        episodio2.setIntegrantes("Expertos en traveling", "Andrea, Steve, Rosy, Raquel");
        episodio2.setNumero(2);
        episodio2.setMinutosDuracion(45);
        episodio2.setNombre("¿Destinos con la mejor gastronomía?");
        episodio2.setTemporada(1);
        episodio2.setReproducciones(1050);
        ranking.muestraRanking(episodio2);

        unPodcast.muestraFichaTecnica();
        System.out.println("");


        System.out.println("Evaluación podcast: "+unPodcast.mediaNotas()+"");


        episodio1.muestraFichaTecnica();
        episodio2.muestraFichaTecnica();



        Integrantes integrantes = new Integrantes("","Blizz J.");
        Integrantes integrantes2 = new Integrantes("Good Noises","");

        Cancion cancion1 = new Cancion();
        cancion1.setIntegrantes(integrantes);
        cancion1.setTitulo("Just");
        cancion1.setAlbum("Space");
        cancion1.setGenero("Electronic");
        cancion1.setPista(1);
        cancion1.setDuracion(7);
        cancion1.setFechaLanzamiento(2001);
        cancion1.valorar(8.9);
        cancion1.valorar(7.8);
        cancion1.valorar(9.9);

        cancion1.muestraFichaTecnica();
        cancion1.setTotalReproducciones(20000);
        ranking.muestraRanking(cancion1);


        Cancion cancion2 = new Cancion();
        cancion2.setIntegrantes(integrantes2);
        cancion2.setTitulo("Blue sky");
        cancion2.setAlbum("Grounded");
        cancion2.setGenero("R&B");
        cancion2.setPista(5);
        cancion2.setDuracion(4);
        cancion2.setFechaLanzamiento(2005);
        cancion2.valorar(10.0);
        cancion2.valorar(10.0);
        cancion2.valorar(10.0);

        cancion2.muestraFichaTecnica();
        cancion2.setTotalReproducciones(300);
        ranking.muestraRanking(cancion2);

        CaluladoraDeTiempos caluladoraDeTiempos = new CaluladoraDeTiempos();
        caluladoraDeTiempos.incluye(unPodcast);
        caluladoraDeTiempos.incluye(cancion1);
        caluladoraDeTiempos.incluye(cancion2);

        System.out.println("Tiempo total a reproducirse: " + caluladoraDeTiempos.getTiempoTotal() + " minutos");


    }
}
