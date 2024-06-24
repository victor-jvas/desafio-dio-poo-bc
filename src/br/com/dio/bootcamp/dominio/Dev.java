package br.com.dio.bootcamp.dominio;

import java.util.ArrayList;
import java.util.List;

public class Dev {

    String name;
    List<Mentoring> mentoring;
    List<Activity> activities;

    public Dev(String name) {
        this.name = name;
        mentoring = new ArrayList<Mentoring>();
        activities =  new ArrayList<Activity>();
    }

    public Boolean enterBootcamp(Bootcamp bootcamp){
        bootcamp.addParticipant(this);
        return true;
    }

    public void advance(){

    }

    public int calculateTotalXp(){
        return 0;
    }

    public void showCourses(){}

}
