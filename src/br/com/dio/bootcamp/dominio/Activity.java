package br.com.dio.bootcamp.dominio;

public abstract class Activity {

    static final double DEFAULT_XP = 10d;

    protected String title;
    protected String description;


    public abstract double calculateXp();
}
