package reviewpicker.service;

import reviewpicker.component.PickerStack;
import reviewpicker.console.InputConsole;
import reviewpicker.console.OutputConsole;

import java.util.Arrays;
import java.util.List;

public class PickReviewerService {

    public void pick(){
        List<String> inputList = new InputConsole().getInput();
        int size = inputList.size();

        PickerStack<String> pickerStack = new PickerStack<String>(inputList);
        pickerStack.shuffle();

        String[] reviewers = new String[size];

        for (int i = size-1; i >= 0; i--) {
            String name = pickerStack.swapAndPopIfEqual(inputList.get(i));
            reviewers[i] = name;
        }

        new OutputConsole().writeResult(inputList, reviewers);
    }

}
