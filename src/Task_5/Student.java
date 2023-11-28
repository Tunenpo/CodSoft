package Task_5;

import java.util.ArrayList;
import java.util.Random;

public class Student {
    String Id ;
    String name;
    ArrayList<Course> courses;

    public Student(String name, ArrayList<Course> courses) {
        Id = new Random().toString();
        this.name = name;
        this.courses = courses;
    }
}
