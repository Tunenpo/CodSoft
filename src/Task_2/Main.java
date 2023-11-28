package Task_2;

import Task_1.GuessingService;

public class Main {
    public static void main(String[] args){

        GradeCalculation gradeCalculation = new GradeCalculation();
        var numberOfSubjects = gradeCalculation.GetNumberOfSubject();
        var gradeSum = gradeCalculation.GetGrades(numberOfSubjects);
        var average = gradeCalculation.GetAverage(gradeSum, numberOfSubjects);
        System.out.printf("Your average score is %f",average);

    }
}
