package Task_4;

import java.util.List;

public interface IOptionService {
    void validateOption(String chosenOption, List<Option> options);
    String selectOption(String chosenOption, List<Option> options);
}
