package arraytask;

import java.sql.SQLOutput;

public class DoubleWArray {
    public static void main(String[] args) {

        Double[] value = {45.56, 645.65, 56.89};
        Double num1 =  value[0];
        Double num2 =  value[1];
        Double num3 =  value[2];

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        Double sum = num1 + num2 + num3;
        System.out.println(sum);

        //-----------------------------------------

        Double[] value1 = new Double[3];
        value1[0] = 45.56;
        value1[1] = 645.65;
        value1[2] = 56.89;

        System.out.println(value1[0]);
        System.out.println(value1[1]);
        System.out.println(value1[2]);

        Double sum1 = value1[0] + value1[1] + value1[2];
        System.out.println(sum1);

    }
}
