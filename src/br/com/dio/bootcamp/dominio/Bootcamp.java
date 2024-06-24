package br.com.dio.bootcamp.dominio;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {

    private LocalDate startDate = LocalDate.now();
    private LocalDate endDate = LocalDate.now().plusDays(45);
    private String name;
    private String description;

    private Set<Dev> participants = new HashSet<>();
    private Set<Activity> activities = new LinkedHashSet<>();


    public void addParticipant(Dev dev){
        this.participants.add(dev);
    }

    public Set<Activity> getActivities() {
        return activities;
    }
}
