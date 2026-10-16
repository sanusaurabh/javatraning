package array;

public class ArrayDouble {

    public static void main(String[] args){
        Double[] value = {44.5D, 22.1D, 11.2D, 88.2D};

        Double num1 = value[0];
        Double num2 = value[1];
        Double num3 = value[2];
        Double num4 = value[3];

        System.out.println("value[0] = " + value[0]);
        System.out.println("value[1] = " + value[1]);
        System.out.println("value[2] = " + value[2]);
        System.out.println("value[3] = " + value[3]);

        Double add = num1 + num2 + num3 + num4;
        Double add1 = value[0] + value[1] + value[2] + value[3];

        System.out.println("add = " + add);
        System.out.println("add1 = " + add1);

        System.out.println("..................");

        Double[] value1 = new Double[4];
        value1[0] = 98.2D;
        value1[1] = 77.2D;
        value1[2] = 81.1D;
        value1[3] = 33.1D;

        System.out.println("value[0] = " + value1[0]);
        System.out.println("value[1] = " + value1[1]);
        System.out.println("value[2] = " + value1[2]);
        System.out.println("value[3] = " + value1[3]);

        Double addValue1 = value1[0] + value1[1] + value1[2] + value1[3];
        System.out.println("addValue1 = " + addValue1);
    }
}
