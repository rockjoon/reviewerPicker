package reviewpicker.component;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

class PickerStackTest {

    String[] arr;
    PickerStack<String> pickerStack;

    @BeforeEach
    void setArr() {
        arr = new String[]{"a", "b", "c", "d", "e", "f", "g"};
        pickerStack = new PickerStack<>(Arrays.asList(arr));
    }

    @DisplayName("swap")
    @Test
    void swap() {
        pickerStack.swap(arr, 0, 1);
        assertThat(arr[0]).isEqualTo("b");
        assertThat(arr[1]).isEqualTo("a");
    }

    @DisplayName("shuffle")
    @Test
    void shuffle() {
        pickerStack.shuffle();
        assertThat(pickerStack.stack).contains("a", "b", "c", "d", "e", "f", "g");
    }

    @DisplayName("pop test")
    @Test
    void popTest() {
        int size = arr.length;
        String result = arr[--size];
        arr[size] = null;
        assertThat(arr).doesNotContain("g");
    }

    @DisplayName("swapIfEqual")
    @Test
    void swapIfEqual() {
        int size = arr.length;
        String result = arr[--size];
        String target = "g";
        if (result.equals("g")) {
            pickerStack.swap(arr, size, size-1);
        }
        arr[size] = null;
        assertThat(arr[5]).isEqualTo("g");
    }
}