package com.aluracursos.desafioaudio.principal;

import com.aluracursos.desafioaudio.modelo.Cancion;
import com.aluracursos.desafioaudio.modelo.MisFavoritos;
import com.aluracursos.desafioaudio.modelo.Podcast;

public class Principal {
    public static void main(String[] args) {

        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguiar");
        miPodcast.setTitulo("Café Tech");

        // CANCIÓN
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 2000; i++) {
            miCancion.reproducir();
        }

        // PODCAST
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }

        for (int i = 0; i < 8000; i++) {
            miPodcast.reproducir();
        }

        System.out.println("Total de Reproducciones: " + miCancion.getTotalReproducciones());
        System.out.println("Total de Me Gusta: " + miCancion.getMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miCancion);
        favoritos.adicione(miPodcast);
    }
}
