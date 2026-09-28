package com.shauryax.methodType;

public class MutipleIntTwoNumberUserMethod {

    public static void main(String[] args){
        Integer x = 10;
        Integer y = 20;
        Integer z = x * y;
        System.out.println("multiple = " + z);

        MultipleIntTwoNumberUserMethod multipleTwoNumber =
                new MultipleIntTwoNumberUserMethod();

        multipleTwoNumber.multiple();
        multipleTwoNumber.multipleByParameter(5, 2);

        Integer artivalue = multipleTwoNumber.multipleAndReturnValue();
        System.out.println("multiple of artivalue = " + artivalue);

        Integer pratyvalue =
                multipleTwoNumber.multipleByParameterAndReturnValue(12, 2);
        System.out.println("multiple of pratyvalue = " + pratyvalue);
    }

    //suraj
    public void multiple(){
        Integer a = 10;
        Integer b = 20;
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
        Integer a = 15;
        Integer b = 5;
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