package calculator;

public class Calculator {
    public int add(String[] nums) {
        int result = 0;
        for (String num : nums) {
            int temp = Integer.parseInt(num);
            result += temp;
        }
        return result;
    }
}
