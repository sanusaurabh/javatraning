package arraytask;

public class LongArray {
    public static void main(String[] args) {
        long[] value = {32545l, 46346l, 436657l};

        long num1 =  value[0];
        long num2 = value[1];
        long num3 = value[2];

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        long sum =  num1 + num2 + num3;
        System.out.println(sum);

        //-------------------------------------------

        long[] value1 = new long[3];

        value1[0] = num1;
        value1[1] = num2;
        value1[2] = num3;

        System.out.println(value1[0]);
        System.out.println(value1[1]);
        System.out.println(value1[2]);

        long sum1 = value1[0] + value1[1] + value1[2];
        System.out.println(sum1);

    }
}
