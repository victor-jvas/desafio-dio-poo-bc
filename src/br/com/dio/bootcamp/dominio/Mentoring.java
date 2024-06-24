package br.com.dio.bootcamp.dominio;

import java.time.LocalDate;

public class Mentoring extends Activity {

    private LocalDate mentoringDate = LocalDate.now().plusDays(1);


    @Override
    public double calculateXp() {
        return DEFAULT_XP+20d;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "description='" + description + '\'' +
                ", title='" + title + '\'' +
                ", mentoringDate=" + mentoringDate +
                '}';
    }
}
