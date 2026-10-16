package array;

public class ArrayInteger {

    public static void main(String[] args){
        Integer[] value = {11, 22, 33, 44, 55};

        Integer num1 = value[0];
        Integer num2 = value[1];
        Integer num3 = value[2];
        Integer num4 = value[3];
        Integer num5 = value[4];

        System.out.println("value[0] = " + value[0]);
        System.out.println("value[1] = " + value[1]);
        System.out.println("value[2] = " + value[2]);
        System.out.println("value[3] = " + value[3]);
        System.out.println("value[4] = " + value[4]);


        Integer add = num1 + num2 + num3 + num4 + num5;
        Integer add1 = value[0] + value[1] + value[2] + value[3] + value[4];

        System.out.println("add = " + add);
        System.out.println("add1 = " + add1);

        System.out.println("..................");

        Integer[] value1 = new Integer[5];
        value1[0] = 40;
        value1[1] = 50;
        value1[2] = 30;
        value1[3] = 20;
        value1[4] = 10;

        System.out.println("value[0] = " + value1[0]);
        System.out.println("value[1] = " + value1[1]);
        System.out.println("value[2] = " + value1[2]);
        System.out.println("value[3] = " + value1[3]);
        System.out.println("value[4] = " + value1[4]);

        Integer addValue1 = value1[0] + value1[1] + value1[2] + value1[3] + value1[4];
        System.out.println("addValue1 = " + addValue1);
    }
}
