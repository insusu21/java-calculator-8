package calculator;

import camp.nextstep.edu.missionutils.Console;

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
            if (a == null) {
                return 0;
            }
            if(!a.matches("\\d+")){
                throw new IllegalArgumentException();
            }
            int num = Integer.parseInt(a);
            result += num;
        }
        return result;
    }
}
