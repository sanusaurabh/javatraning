package addition;

public class IntAdditionTest {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(20, 30);

        if (result == 50) {
            System.out.println("Test Case Passed!");
        } else {
            System.out.println("Test Case Failed!");
        }
    }
}
