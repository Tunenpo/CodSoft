package Task_5;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    Scanner scanner = new Scanner(System.in);
    public void Register() {
        System.out.println("Enter your name");
        String name = scanner.next();
        System.out.println("How many courses are you taking");
        Integer noCourses = scanner.nextInt();
        System.out.println("Enter the courses, Press enter to add");
        ArrayList<Course> courses = new ArrayList<>();
        for (int i = 0; i < noCourses; i++) {
            String courseName = scanner.next();
//          You need to get course by this courseName
        }
        var student = new Student(name,courses);
//      You need to add into database
    }
    public void RemoveCourse(String courseCode) {
//
//        You need to get from course from tha database by courseCode
//        Then delete from the database
    }
}
