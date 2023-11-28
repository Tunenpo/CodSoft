package Task_4;

import java.util.List;
import java.util.Objects;

public class OptionService implements IOptionService {
    IScoreService scoreService = new ScoreService();
    @Override
    public void validateOption(String chosenOption, List<Option> options) {
        for (Option option: options) {
            if (Objects.equals(option.Text, chosenOption) && option.IsCorrect) {
                System.out.println("Correct");
                ScoreService.score ++;
                return;
            }
        }
        System.out.println("Incorrect");
    }
    public String selectOption(String chosenOption, List<Option> options) {
        switch (chosenOption){
            case "A":
                chosenOption = options.get(0).Text;
                break;
            case "B":
                chosenOption = options.get(1).Text;
                break;
            case "C":
                chosenOption = options.get(2).Text;
                break;
            default:
                System.out.println("Invalid Option");
        }
        return chosenOption;
    }
}
