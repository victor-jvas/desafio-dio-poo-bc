import br.com.dio.bootcamp.dominio.*;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Bootcamp bootcamp = new Bootcamp("Java POO", "A bootcamp to learn POO using Java language.");

        Dev dev1 = new Dev("Jose");

        Set<Activity> activities = new LinkedHashSet<>();

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Mentoria 1");
        mentoring.setDescription("Mentoria 1 description.");

        Course course = new Course();
        course.setTitle("Course 1");
        course.setDescription("Course 1 description.");

        activities.add(mentoring);
        activities.add(course);

        bootcamp.setActivities(activities);

        dev1.enterBootcamp(bootcamp);

        dev1.showCourses();

        System.out.println(mentoring.calculateXp());

        System.out.println(dev1.calculateTotalXp());

        dev1.advance();

        dev1.showCourses();
        System.out.println(dev1.calculateTotalXp());

        System.out.println(dev1.getFinishedActivities());


    }
}