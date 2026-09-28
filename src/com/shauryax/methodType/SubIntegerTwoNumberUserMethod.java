package com.shauryax.methodType;

public class SubIntegerTwoNumberUserMethod {

    public static void main(String[] args){
        Integer x = 84;
        Integer y = 56;
        Integer z = x - y;
        System.out.println("sub = " + z);

        SubIntegerTwoNumberUserMethod subTwoNumber =
                new SubIntegerTwoNumberUserMethod();

        subTwoNumber.subtraction();
        subTwoNumber.subtractionByParameter(5, 2);

        Integer artivalue = subTwoNumber.subtractionAndReturnValue();
        System.out.println("sub of artivalue = " + artivalue);

        Integer pratyvalue =
                subTwoNumber.subtractionByParameterAndReturnValue(122, 22);
        System.out.println("sub of pratyvalue = " + pratyvalue);
    }

    //suraj
    public void subtraction(){
        Integer a = 44;
        Integer b = 50;
        Integer c = a - b;
        System.out.println("subtraction of two number is " + c);
    }

    //himan
    public void subtractionByParameter(Integer a, Integer b){
        Integer d = a;
        Integer e = b;
        Integer f = a - b;
        System.out.println("parameter subtraction of two number is " + f);
    }

    //arti
    public Integer subtractionAndReturnValue(){
        Integer a = 45;
        Integer b = 54;
        Integer c = a - b;
        return c;
    }

    //praty
    public Integer subtractionByParameterAndReturnValue(Integer u, Integer v){
        Integer w = u;
        Integer x = v;
        Integer y = w - x;
        return y;
    }
}
