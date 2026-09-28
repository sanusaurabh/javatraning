package com.shauryax.methodType;

public class AddIntTwoNumberUserMethod {

    public static void main(String[] args) {

        int x = 20;
        int y = 24;
        int z = x + y;
        System.out.println("sum = " + z);

        //addition();
        AddIntTwoNumberUserMethod addTwoNumber = new AddIntTwoNumberUserMethod();
        addTwoNumber.addition();
        addTwoNumber.additionByParameter(10,20);

        int artivalue = addTwoNumber.additionAndReturnValue();
        System.out.println("sum of artivalue = " + artivalue);

        int pratyvalue = addTwoNumber.additionByParameterAndReturnValue(100, 200);
        System.out.println("sum of pratyvalue is " + pratyvalue);
    }

    //praty
    public int additionByParameterAndReturnValue(int a, int b) {
        int w = a;
        int x = b;
        int z = a + b;
        return z;
    }

    //arti
    public int additionAndReturnValue() {
        int a = 8;
        int b = 9;
        int c = a + b;
        return c;
    }

    //suraj
    public void addition() {
        int a = 6;
        int b = 8;
        int c = a + b;
        System.out.println("addition of two number is " + c);
    }


    //himashu
    public void additionByParameter(int a, int b) {
        int d = a;
        int e = b;
        int f = d + e;
        System.out.println("parameter addition of two number is " + f);
    }
}
