package arraytask;

public class IntegerArray {
    public static void main(String[] args) {
        Integer[] value = {1, 2, 3, 4, 5, 6};
        Integer num1 = value[0];
        Integer num2 = value[1];
        Integer num3 = value[2];
        Integer num4 = value[3];
        Integer num5 = value[4];
        Integer num6 = value[5];

        System.out.println("value[0] = " + num1);
        System.out.println("value[1] = " + num2);
        System.out.println("value[2] = " + num3);
        System.out.println("value[3] = " + num4);
        System.out.println("value[4] = " + num5);
        System.out.println("value[5] = " + num6);



        Integer add = value[0] + value[1] + value[2] + value[3] + value[4] + value[5];
        System.out.println("add = " + add);

        Integer[] value1 = new Integer[]{10, 20, 30, 40, 50};
        value1[0] = 10;
        value1[1] = 20;
        value1[2] = 30;
        value1[3] = 40;
        value1[4] = 50;

        System.out.println(" value1[0] = " + value1[0]);
        System.out.println(" value1[1] = " + value1[1]);
        System.out.println(" value1[2] = " + value1[2]);
        System.out.println(" value1[3] = " + value1[3]);
        System.out.println(" value1[4] = " + value1[4]);

        int addValue1 = value1[0] + value1[1] + value1[2] + value1[3]+ value1[4];
        System.out.println("addvalue1 = "+ addValue1);

    }
}
