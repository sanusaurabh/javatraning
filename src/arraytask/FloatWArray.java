package arraytask;

public class FloatWArray {
    public static void main(String[] args) {
        Float[] value = {326.22f, 45.66f, 56.55f};

        Float num1 = value[0];
        Float num2 = value[1];
        Float num3 = value[2];

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        Float sum = num1 + num2 + num3;
        System.out.println(sum);

        //--------------------------------------

        Float[] value1 = new Float[3];

        value1[0] = 326.22f;
        value1[1] = 45.66f;
        value1[2] = 56.55f;

        System.out.println(value1[0]);
        System.out.println(value1[1]);
        System.out.println(value1[2]);

        Float sum1 = value1[0] + value1[1] + value1[2];
        System.out.println(sum1);
    }
}
