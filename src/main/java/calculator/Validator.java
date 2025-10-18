package calculator;

public class Validator {
    public void ValidateWrong (String[] st){
        for (String a : st) {
            if(!a.matches("\\d+")){
                throw new IllegalArgumentException();
            }
        }
    }
}
