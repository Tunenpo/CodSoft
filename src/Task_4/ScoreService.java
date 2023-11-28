package Task_4;

public class ScoreService implements IScoreService {
    public static int score = 0;
    @Override
    public void addScore(){
        score += 1;
    }
    @Override
    public void printFinalScore(){
        score += 1;
        System.out.println("\nYour score is " + score + "/" + QuestionService.getQuestions().size());
    }
}
