package array;

public class Arraydouble2 {

    public static void main(String[] args){
        double[] value = {66.2d, 22d, 87,1d, 12d};

        double num1 = value[0];
        double num2 = value[1];
        double num3 = value[2];
        double num4 = value[3];

        System.out.println("value[0] = " + value[0]);
        System.out.println("value[1] = " + value[1]);
        System.out.println("value[2] = " + value[2]);
        System.out.println("value[3] = " + value[3]);

        double add = num1 + num2 + num3 + num4;
        double add1 = value[0] + value[1] + value[2] + value[3];

        System.out.println("add = " + add);
        System.out.println("add1 = " + add1);

        System.out.println("..................");

        double[] value1 = new double[4];
        value1[0] = 28.2d;
        value1[1] = 17.2d;
        value1[2] = 11.1d;
        value1[3] = 33.1d;

        System.out.println("value[0] = " + value1[0]);
        System.out.println("value[1] = " + value1[1]);
        System.out.println("value[2] = " + value1[2]);
        System.out.println("value[3] = " + value1[3]);

        double addValue1 = value1[0] + value1[1] + value1[2] + value1[3];
        System.out.println("addValue1 = " + addValue1);
    }
}
