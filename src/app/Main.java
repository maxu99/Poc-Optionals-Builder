package app;

import Controladora.EventController;
import clases.City;
import clases.Evento;
import clases.Location;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        EventController cEvent = new EventController();
        List<Evento> eventos = Arrays.asList(
                                            new Evento(3, "Pelicula Random",
                                                    new Location(3, "Ambassador",
                                                            new City(3,"Mar Del Plata"))),
                                            new Evento(1, "Recital La Renga",
                                                new Location(1, "Polideportivo",
                                                        new City(1,"Mar del Plata"))),
                                                new Evento(2, "Obra Teatral",
                                                    new Location(2, "Radio City",
                                                        new City(2,"Mar Del Plata"))),
                                                new Evento(4, "Lollapalooza",
                                                        new Location(4, "Mogotes",
                                                                new City(4,"Mar Del Plata"))),
                                                new Evento(6, "Luis Miguel Recargado",
                                                        new Location(6, "Quba",
                                                                new City(6,"Mar del Plata"))),
                                                new Evento(5, "Pepa Pig sobre Hielo",
                                                        new Location(5, "Teatro",
                                                                new City(5,"Mar Del Plata")))
        );

        //System.out.println(eventos);
        System.out.println( Optional.ofNullable(cEvent.getPrimerosCincoOrdenados(eventos))

        );

    }
}
