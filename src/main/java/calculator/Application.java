package calculator;

public class Application {
    public static void main(String[] args) {
        int result;

        Calculator cal = new Calculator();
        cal.userinput();

        Divider div = new Divider(cal.getinput());
        div.customdivider();
        String[] nums = div.divide();

        if (nums.length == 1 && nums[0].isEmpty()) {
            cal.print(0);
        }
        Validator val = new Validator();
        val.validatewrong(nums);

        result = cal.add(nums);
        cal.print(result);
    }
}
