package com.shauryax.methodType;

public class DivideIntegerTwoNumberUserMethod {

    public static void main(String[] args){
        Integer x = 100;
        Integer y = 50;
        Integer z = x / y;
        System.out.println("divide = " + z);

        DivideIntegerTwoNumberUserMethod divideTwoNumber =
                new DivideIntegerTwoNumberUserMethod();

        divideTwoNumber.division();
        divideTwoNumber.divisionByParameter(24, 4);

        Integer artivalue = divideTwoNumber.divisionAndReturnValue();
        System.out.println("divide of artivalue = " + artivalue);

        Integer pratyvalue =
                divideTwoNumber.divisionByParameterAndReturnValue(140, 20);
        System.out.println("divide of pratyvalue = " + pratyvalue);
    }

    //suraj
    public void division(){
        Integer a = 80;
        Integer b = 10;
        Integer c = a / b;
        System.out.println("division of two number is " + c);
    }

    //himan
    public void divisionByParameter(Integer a, Integer b){
        Integer d = a;
        Integer e = b;
        Integer f = a / b;
        System.out.println("parameter division of two number is " + f);
    }

    //arti
    public Integer divisionAndReturnValue(){
        Integer a = 80;
        Integer b = 40;
        Integer c = a / b;
        return c;
    }

    //praty
    public Integer divisionByParameterAndReturnValue(Integer u, Integer v){
        Integer w = u;
        Integer x = v;
        Integer y = w / x;
        return y;
    }
}
