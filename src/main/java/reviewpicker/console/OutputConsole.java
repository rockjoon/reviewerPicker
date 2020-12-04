package reviewpicker.console;

import java.util.List;

public class OutputConsole {

    public void writeResult(List<String> inputList, String[] reviewers) {

        System.out.println("==============================");
        for (int i = 0; i < inputList.size(); i++) {
            System.out.println(inputList.get(i) + "  ->  " + reviewers[i]);
        }
        System.out.println("==============================");
    }
}
