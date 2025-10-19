package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Input {
    private String input;

    public void userinput() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        this.input = Console.readLine();
    }

    public String getinput() {
        return this.input;
    }
}
