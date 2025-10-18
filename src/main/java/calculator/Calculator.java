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

    public int add(String[] st) {
        int result = 0;
        for (String a : st) {
            if (a.isEmpty()) {
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
