package Task_2;

import java.util.Scanner;

public class GradeCalculation {
    Scanner scanner;

    public GradeCalculation() {
        this.scanner = new Scanner(System.in);
    }

    public int GetNumberOfSubject() {
        System.out.print("Enter number of subjects: ");
        int numberOfSubject = this.scanner.nextInt();
        return numberOfSubject;
    }

    public float GetGrades(int numberOfSubjects) {
        float[] scores = new float[numberOfSubjects];

        for(int i = 0; i < numberOfSubjects; ++i) {
            System.out.print("Enter Grade: ");
            float score = this.scanner.nextFloat();
            scores[i] = score;
        }

        return this.SumScores(scores);
    }

    public float SumScores(float[] scores) {
        float totalScore = 0.0F;
        float[] var3 = scores;
        int var4 = scores.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            float score = var3[var5];
            totalScore += score;
        }

        return totalScore;
    }

    public float GetAverage(float totalScore, int numberOfSubject) {
        return totalScore / (float)numberOfSubject;
    }

}
