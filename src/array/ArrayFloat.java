package array;

public class ArrayFloat {

    public static void main(String[] args){
        Float[] value = {77F, 71F, 98F, 86F};

        Float num1 = value[0];
        Float num2 = value[1];
        Float num3 = value[2];
        Float num4 = value[3];

        System.out.println("value[0] = " + value[0]);
        System.out.println("value[1] = " + value[1]);
        System.out.println("value[2] = " + value[2]);
        System.out.println("value[3] = " + value[3]);

        Float add = num1 + num2 + num3 + num4;
        Float add1 = value[0] + value[1] + value[2] + value[3];

        System.out.println("add = " + add);
        System.out.println("add1 = " + add1);

        System.out.println("..................");

        Float[] value1 = new Float[4];
        value1[0] = 76F;
        value1[1] = 77F;
        value1[2] = 85F;
        value1[3] = 33F;

        System.out.println("value[0] = " + value1[0]);
        System.out.println("value[1] = " + value1[1]);
        System.out.println("value[2] = " + value1[2]);
        System.out.println("value[3] = " + value1[3]);

        Float addValue1 = value1[0] + value1[1] + value1[2] + value1[3];
        System.out.println("addValue1 = " + addValue1);
    }
}
