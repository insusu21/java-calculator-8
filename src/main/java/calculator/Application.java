package calculator;

public class Application {
    public static void main(String[] args) {
        int result;
        Calculator cal = new Calculator();
        cal.userinput();
        try {
            Divider div = new Divider(cal.getinput());
            div.customdivider();
            result = cal.add(div.divide());
            System.out.println("결과 : " + result);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }
}
