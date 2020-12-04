package reviewpicker.service;

import org.junit.jupiter.api.Test;
import reviewpicker.component.PickerStack;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class PickReviewerServiceTest {

    @Test
    void pick() {
        List<String> inputList = Arrays.asList("a", "b", "c", "d", "e", "f", "g");
        int size = inputList.size();


        PickerStack<String> pickerStack = new PickerStack<String>(inputList);
        pickerStack.shuffle();

        String[] reviewers = new String[size];

        for (int i = size-1; i >= 0; i--) {
            String name = pickerStack.swapAndPopIfEqual(inputList.get(i));
            reviewers[i] = name;
        }

        inputList.stream().forEach(
                s->assertThat(reviewers).contains(s)
        );
    }
}