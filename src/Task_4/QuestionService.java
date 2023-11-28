package Task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionService {
    IOptionService optionService = new OptionService();
    IScoreService scoreService = new ScoreService();
    public static List<Question> getQuestions() {
        // Initialize Options for Animal Questions
        List<Option> animalOptions1 = new ArrayList<>();
        animalOptions1.add(new Option("Lion", true));
        animalOptions1.add(new Option("Elephant", false));
        animalOptions1.add(new Option("Giraffe", false));

        List<Option> animalOptions2 = new ArrayList<>();
        animalOptions2.add(new Option("Dog", false));
        animalOptions2.add(new Option("Cat", false));
        animalOptions2.add(new Option("Fish", true));

        // Initialize Options for Science Questions
        List<Option> scienceOptions1 = new ArrayList<>();
        scienceOptions1.add(new Option("Gravity", true));
        scienceOptions1.add(new Option("Magnetism", false));
        scienceOptions1.add(new Option("Light", false));

        List<Option> scienceOptions2 = new ArrayList<>();
        scienceOptions2.add(new Option("Oxygen", true));
        scienceOptions2.add(new Option("Carbon Dioxide", false));
        scienceOptions2.add(new Option("Nitrogen", false));

        // Initialize Questions
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is the king of the jungle?", animalOptions1));
        questions.add(new Question("Which pet is known for its ability to swim?", animalOptions2));
        questions.add(new Question("What force keeps planets in orbit?", scienceOptions1));
        questions.add(new Question("Which gas do humans primarily breathe in?", scienceOptions2));
        return questions;
    }
    Scanner scanner = new Scanner(System.in);
    public void AskQuestion() {
        var questions = getQuestions();
        int questionNo = 1;
        for (Question question : questions) {
            int optionNo = 65;
            System.out.println("Question " + questionNo + ":" + question.Text);
            for (Option option : question.Options) {
                System.out.println((char)optionNo + ": " + option.Text );
                optionNo++;
            }
            questionNo++;
            var chosenOpt = scanner.next().toUpperCase();
            chosenOpt = optionService.selectOption(chosenOpt, question.Options);
            optionService.validateOption(chosenOpt, question.Options);
        }
        System.out.println("\nYour score is " + ScoreService.score + "/" + QuestionService.getQuestions().size());
    }
}
