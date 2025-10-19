package calculator;

public class Validator {
    public void validatewrong (String[] nums){
        for (String num : nums) {
            if(!num.matches("\\d+")){
                throw new IllegalArgumentException();
            }
        }
    }
}
