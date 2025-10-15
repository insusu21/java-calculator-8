package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Divider {
    String custom = null;
    String input;

    public Divider(String input) {
        this.input = input;
    }

    public void customdivider() {
        if (input.startsWith("//")) {
            Pattern pattern = Pattern.compile("//(.*)\\\\n(.*)");
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                custom = matcher.group(1);
                this.input = matcher.group(2);
            }
        }
    }

    public String[] divide() {
        String regex = ":|,";
        if (custom != null) {
            regex = regex + "|" + Pattern.quote(custom);
        }
        return this.input.split(regex);
    }
}

