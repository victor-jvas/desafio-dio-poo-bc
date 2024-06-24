package br.com.dio.bootcamp.dominio;

public class Course extends Activity {

    private int workload;

    @Override
    public double calculateXp() {
        return DEFAULT_XP * workload;
    }

    @Override
    public String toString() {
        return "Course{" +
                "description='" + description + '\'' +
                ", title='" + title + '\'' +
                ", workload=" + workload +
                '}';
    }
}
