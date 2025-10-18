package calculator;

public class Application {
    public static void main(String[] args) {
        int result;

        Calculator cal = new Calculator();
        cal.userinput();

        Divider div = new Divider(cal.getinput());
        div.customdivider();
        String[] st = div.divide();

        Validator val = new Validator();
        val.ValidateWrong(st);

        result = cal.add(st);
        cal.print(result);
    }
}
