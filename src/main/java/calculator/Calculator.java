package calculator;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class Calculator {
    private String input;

    public void userinput() {
        input = Console.readLine();
    }

    public int add(List<Integer> nums) {
        int result = 0;
        for (int a : nums) {
            result += a;
        }
        return result;
    }
}
