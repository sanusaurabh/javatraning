package com.shauryax.methodType;

public class MultipleIntegerTwoNumberUserMethod {

    public static void main(String[] args){
        Integer x = 30;
        Integer y = 40;
        Integer z = x * y;
        System.out.println("multiple = " + z);

        MultipleIntegerTwoNumberUserMethod multipleTwoNumber =
                new MultipleIntegerTwoNumberUserMethod();

        multipleTwoNumber.multiple();
        multipleTwoNumber.multipleByParameter(8, 5);

        Integer artivalue = multipleTwoNumber.multipleAndReturnValue();
        System.out.println("multiple of artivalue = " + artivalue);

        Integer pratyvalue =
                multipleTwoNumber.multipleByParameterAndReturnValue(9, 11);
        System.out.println("multiple of pratyvalue = " + pratyvalue);
    }

    //suraj
    public void multiple(){
        Integer a = 50;
        Integer b = 250;
        Integer c = a * b;
        System.out.println("multiple of two number is " + c);
    }

    //himan
    public void multipleByParameter(Integer a, Integer b){
        Integer d = a;
        Integer e = b;
        Integer f = a * b;
        System.out.println("parameter multiple of two number is " + f);
    }

    //arti
    public Integer multipleAndReturnValue(){
        Integer a = 40;
        Integer b = 25;
        Integer c = a * b;
        return c;
    }

    //praty
    public Integer multipleByParameterAndReturnValue(Integer u, Integer v){
        Integer w = u;
        Integer x = v;
        Integer y = w * x;
        return y;
    }
}
