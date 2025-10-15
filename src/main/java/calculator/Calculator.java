package calculator;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class Calculator {
    private String input;

    public void userinput() {
        this.input = Console.readLine();
    }

    public String getinput() {
        return this.input;
    }
    public int add(String[] st) {
        int result = 0;
        for (String a : st) {
            int num = Integer.parseInt(a);
            result += num;
        }
        return result;
    }
}
