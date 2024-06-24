package br.com.dio.bootcamp.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {

    LocalDate startDate;
    LocalDate endDate;
    String name;
    String description;

    List<Dev> participants;

    public Bootcamp(LocalDate startDate, LocalDate endDate, String name, String description) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.name = name;
        this.description = description;

        this.participants = new ArrayList<>();
    }

    public void addParticipant(Dev dev){
        this.participants.add(dev);
    }
}
