package calculator;

public class Application {
    public static void main(String[] args) {
        int result;
        Input input = new Input();
        Output output = new Output();
        Calculator cal = new Calculator();
        input.userinput();
        Divider div = new Divider(input.getinput());
        div.customdivider();
        String[] nums = div.divide();

        if (nums.length == 1 && nums[0].isEmpty()) {
            output.print(0);
        }
        Validator val = new Validator();
        val.validatewrong(nums);

        result = cal.add(nums);
        output.print(result);
    }
}
