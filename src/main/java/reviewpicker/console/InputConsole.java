package reviewpicker.console;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputConsole {

    private final String REQ_CNT_MSG = "총 인원 수를 입력해주세요 : ";
    private final String REQ_NAMES_MSG = "이름을 모두 입력해주세요. 각각의 이름은 띄어쓰기 혹은 줄바꿈으로 구분합니다.";

    Scanner scan = new Scanner(System.in);

    public List<String> getInput(){
        System.out.print(REQ_CNT_MSG);
        int count = scan.nextInt();
        System.out.println(REQ_NAMES_MSG);
        scan.nextLine();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(scan.next());
        }
        scan.close();
        return list;
    }

}
