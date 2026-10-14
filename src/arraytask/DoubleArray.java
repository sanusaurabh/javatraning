package arraytask;

public class DoubleArray {
    public static void main(String[] args) {
        double[] value = {45.56, 645.65, 56.89};

        double num1 = value[0];
        double num2 = value[1];
        double num3 = value[2];

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        double sum = num1 + num2 + num3;
        System.out.println(sum);

        //--------------------------------------------

        double[] value1 = new double[3];
        value1[0] =  45.56;
        value1[1] =  645.65;
        value1[2] =  56.89;

        System.out.println(value1[0]);
        System.out.println(value1[1]);
        System.out.println(value1[2]);


        double sum1 = value1[0] + value1[1] + value1[2];
        System.out.println(sum1);
    }
}
