package Controladora;

import clases.Evento;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EventController {

    public EventController() {

    }
    public List<Evento> getPrimerosCincoOrdenados(List<Evento> eventos){

        eventos= eventos.stream()
                .sorted(Comparator.comparing(Evento::getNombre))
                .limit(5)
                .collect(Collectors.toList());

        return eventos;
    }

}
