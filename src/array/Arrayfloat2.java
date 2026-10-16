package array;

public class Arrayfloat2 {

    public static void main(String[] args){
        float[] value = {23f, 88f, 98f};

        float num1 = value[0];
        float num2 = value[1];
        float num3 = value[2];

        System.out.println("value[0] = " + value[0]);
        System.out.println("value[1] = " + value[1]);
        System.out.println("value[2] = " + value[2]);

        float add = num1 + num2 + num3;
        float add1 = value[0] + value[1] + value[2];

        System.out.println("add = " + add);
        System.out.println("add1 = " + add1);

        System.out.println("..................");

        float[] value1 = new float[3];
        value1[0] = 71f;
        value1[1] = 12f;
        value1[2] = 22f;

        System.out.println("value[0] = " + value1[0]);
        System.out.println("value[1] = " + value1[1]);
        System.out.println("value[2] = " + value1[2]);

        float addValue1 = value1[0] + value1[1] + value1[2];
        System.out.println("addValue1 = " + addValue1);
    }
}
