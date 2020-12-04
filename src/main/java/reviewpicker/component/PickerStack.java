package reviewpicker.component;

import java.util.List;
import java.util.Random;

public class PickerStack<T> {

    public int size;
    public T[] stack;

    public PickerStack(List<T> list) {
        stack = list.toArray((T[]) new Object[size]);
        this.size = stack.length;
    }

    public T swapAndPopIfEqual(T t){
        if(size == 0)
            throw new ArrayIndexOutOfBoundsException();

        T result = stack[--size];

        if (result.equals(t)) {
            swap(stack, size, size - 1);
            result = stack[size];
        }

        stack[size] = null;
        return result;
    }

    public <T> void swap(T[] array, int i, int j) {
        T temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public <T> void shuffle() {
        Random rnd = new Random();
        int size = stack.length;
        for (int i = size; i > 1; i--) {
            swap(stack, i - 1, rnd.nextInt(i));
        }
    }
}
