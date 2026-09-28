package com.shauryax.methodType;

public class AddIntegerTwoNumberUserMethod {

    public static void main(String[] args) {

        Integer x = 10;
        Integer y = 14;
        Integer z = x + y;
        System.out.println("sum = " + z);

        //addition();
        AddIntTwoNumberUserMethod addTwoNumber = new AddIntTwoNumberUserMethod();
        addTwoNumber.addition();
        addTwoNumber.additionByParameter(10,20);

        Integer artivalue = addTwoNumber.additionAndReturnValue();
        System.out.println("sum of artivalue = " + artivalue);

        Integer pratyvalue = addTwoNumber.additionByParameterAndReturnValue(300, 400);
        System.out.println("sum of pratyvalue is " + pratyvalue);
    }

    //praty
    public Integer additionByParameterAndReturnValue(Integer a, Integer b) {
        Integer w = a;
        Integer x = b;
        Integer z = a + b;
        return z;
    }

    //arti
    public Integer additionAndReturnValue() {
        Integer a = 8;
        Integer b = 9;
        Integer c = a + b;
        return c;
    }

    //suraj
    public void addition() {
        Integer a = 6;
        Integer b = 8;
        Integer c = a + b;
        System.out.println("addition of two number is " + c);
    }


    //himashu
    public void additionByParameter(Integer a, Integer b) {
        Integer d = a;
        Integer e = b;
        Integer f = d + e;
        System.out.println("parameter addition of two number is " + f);
    }
}
