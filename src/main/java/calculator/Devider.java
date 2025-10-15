package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Devider {
    String custom = null;
    String input;

    public Devider(String input) {
        this.input = input;
    }
    
    public void customdevider() {
        if (input.startsWith("//")) {
            Pattern pattern = Pattern.compile("//(.*)\\n(.*)");
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                custom = matcher.group(1);
                this.input = matcher.group(2);
            }
        }
    }

}

