package arraytask;

import java.util.Scanner;

public class LongWArray {
    public static   void main(String args[]){
        Long[] value = {35456l, 436546l, 464667l};
        Long num1 = value[0];
        Long num2 = value[1];
        Long num3 = value[2];

        Long sum  = num1 + num2 + num3;
        System.out.println(sum);

        //------------------------------------------

        Long[] value1 = new Long[3];

        value1[0] = num1;
        value1[1] = num2;
        value1[2] = num3;

        Long sum1 = value1[0] + value1[1] + value1[2];
        System.out.println(sum1);


    }
}
