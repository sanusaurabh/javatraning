package arraytask;

public class floatArray {
    public static void main(String[] args) {
        float[] value = {32.55f, 56.87f, 65.87f};

        float num1 = value[0];
        float num2 = value[1];
        float num3 = value[2];

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        float sum = num1 + num2 + num3;
        System.out.println(sum);

        //-----------------------------------------------

        float[] value1 = new float[3];

        value1[0] = 534.45f;
        value1[1] = 56.87f;
        value1[2] = 65.87f;

        System.out.println(value1[0]);
        System.out.println(value1[1]);
        System.out.println(value1[2]);

        float sum1 = value1[0] + value1[1] + value1[2];
        System.out.println(sum1);

    }
}
