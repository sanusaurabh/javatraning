package com.shauryax.methodType;

public class DividefloatTwoNumberUserMethod {

    public static void main(String[] args){
        Float x = 86.3f;
        Float y = 8.0f;
        Float z = x / y;
        System.out.println("divide = " + z);

        DividefloatTwoNumberUserMethod divideTwoNumber =
                new DividefloatTwoNumberUserMethod();

        divideTwoNumber.division();
        divideTwoNumber.divisionByParameter(16f, 4f);

        Float artivalue = divideTwoNumber.divisionAndReturnValue();
        System.out.println("divide of artivalue = " + artivalue);

        Float pratyvalue =
                divideTwoNumber.divisionByParameterAndReturnValue(180f, 12f);
        System.out.println("divide of pratyvalue = " + pratyvalue);
    }

    //suraj
    public void division(){
        Float a = 47.8f;
        Float b = 4.0f;
        Float c = a / b;
        System.out.println("division of two number is " + c);
    }

    //himan
    public void divisionByParameter(Float a, Float b){
        Float d = a;
        Float e = b;
        Float f = a / b;
        System.out.println("parameter division of two number is " + f);
    }

    //arti
    public Float divisionAndReturnValue(){
        Float a = 40.9f;
        Float b = 5.0f;
        Float c = a / b;
        return c;
    }

    //praty
    public Float divisionByParameterAndReturnValue(Float u, Float v){
        Float w = u;
        Float x = v;
        Float y = w / x;
        return y;
    }
}