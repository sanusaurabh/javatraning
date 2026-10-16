package array;

public class ArrayInt {

    public static void main(String[] args){
        int[] value = {5, 6, 7, 8};

        int num1 = value[0];
        int num2 = value[1];
        int num3 = value[2];
        int num4 = value[3];

        System.out.println("value[0] = " + value[0]);
        System.out.println("value[1] = " + value[1]);
        System.out.println("value[2] = " + value[2]);
        System.out.println("value[3] = " + value[3]);

        int add = num1 + num2 + num3 + num4;
        int add1 = value[0] + value[1] + value[2] + value[3];

        System.out.println("add = " + add);
        System.out.println("add1 = " + add1);

        System.out.println("..................");

        int[] value1 = new int[4];
        value1[0] = 10;
        value1[1] = 20;
        value1[2] = 30;
        value1[3] = 40;

        System.out.println("value[0] = " + value1[0]);
        System.out.println("value[1] = " + value1[1]);
        System.out.println("value[2] = " + value1[2]);
        System.out.println("value[3] = " + value1[3]);

        int addValue1 = value1[0] + value1[1] + value1[2] + value1[3];
        System.out.println("addValue1 = " + addValue1);
    }
}
