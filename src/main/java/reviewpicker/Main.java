package reviewpicker;

import reviewpicker.console.InputConsole;
import reviewpicker.service.PickReviewerService;

public class Main {

    public static void main(String[] args) {
        PickReviewerService service = new PickReviewerService();
        service.pick();
    }
}
