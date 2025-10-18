package calculator;

public class Validator {
    public void validatewrong (String[] st){
        for (String a : st) {
            if(!a.matches("\\d+")){
                throw new IllegalArgumentException();
            }
        }
    }
}
