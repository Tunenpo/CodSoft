package Task_5;

import java.util.ArrayList;

public class Course {
    String course_code;
    String title;
    String description;
    Integer capacity;
    String schedule;
    ArrayList<Student> students;

    public Course(String course_code, String title, String description, Integer capacity, String schedule) {
        this.course_code = course_code;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
    }
}
