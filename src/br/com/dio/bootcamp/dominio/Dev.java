package br.com.dio.bootcamp.dominio;

import java.util.*;

public class Dev {

    private String name;
    private Set<Activity> currentActivities = new LinkedHashSet<>();
    private Set<Activity> finishedActivities = new LinkedHashSet<>();

    public Dev(String name) {
        this.name = name;
    }

    public void enterBootcamp(Bootcamp bootcamp){
        this.currentActivities.addAll(bootcamp.getActivities());
        bootcamp.addParticipant(this);
    }

    public void advance(){
        Optional<Activity> activity = this.currentActivities.stream().findFirst();
        if(activity.isPresent()){
            this.currentActivities.remove(activity.get());
            this.finishedActivities.add(activity.get());
        }else {
            System.err.println("Nao foi possivel encontrar o activity");
        }
    }

    public double calculateTotalXp(){
        return this.finishedActivities
                .stream()
                .mapToDouble(Activity::calculateXp)
                .sum();
    }

    public void showCourses(){
        for(Activity activity : this.currentActivities){
            System.out.println(activity.toString());
        }
    }

    public Set<Activity> getFinishedActivities() {
        return finishedActivities;
    }
}
