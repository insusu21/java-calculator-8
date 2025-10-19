package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Calculator {
    private String input;

    public void userinput() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        this.input = Console.readLine();
    }

    public String getinput() {
        return this.input;
    }

    public void print(int result) {
        System.out.println("결과 : " + result);
    }

    public int add(String[] nums) {
        int result = 0;
        for (String num : nums) {
            int temp = Integer.parseInt(num);
            result += temp;
        }
        return result;
    }
}
