package br.com.dio.bootcamp.dominio;

public abstract class Activity {

    static final double DEFAULT_XP = 10d;

    protected String title;
    protected String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double calculateXp();
}
