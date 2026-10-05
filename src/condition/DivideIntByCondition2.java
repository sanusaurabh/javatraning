package condition;

public class DivideIntByCondition2 {

    public static void main(String[] args) {

        int a = 7;
        int b = 0;

        if (b > 0) {
            int c = a / b;
            System.out.println(c);
        } else {
            System.out.println("Can't divide by 0");
        }

    }
}
