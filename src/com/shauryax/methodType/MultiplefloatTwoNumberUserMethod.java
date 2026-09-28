package com.shauryax.methodType;

public class MultiplefloatTwoNumberUserMethod {

    public static void main(String[] args){
        Float x = 70.5f;
        Float y = 30.5f;
        Float z = x * y;
        System.out.println("multiple = " + z);

        MultiplefloatTwoNumberUserMethod multipleTwoNumber =
                new MultiplefloatTwoNumberUserMethod();

        multipleTwoNumber.multiple();
        multipleTwoNumber.multipleByParameter(5f, 2f);

        Float artivalue = multipleTwoNumber.multipleAndReturnValue();
        System.out.println("multiple of artivalue = " + artivalue);

        Float pratyvalue =
                multipleTwoNumber.multipleByParameterAndReturnValue(12f, 2f);
        System.out.println("multiple of pratyvalue = " + pratyvalue);
    }

    //suraj
    public void multiple(){
        Float a = 15.5f;
        Float b = 10.5f;
        Float c = a * b;
        System.out.println("multiple of two number is " + c);
    }

    //himan
    public void multipleByParameter(Float a, Float b){
        Float d = a;
        Float e = b;
        Float f = a * b;
        System.out.println("parameter multiple of two number is " + f);
    }

    //arti
    public Float multipleAndReturnValue(){
        Float a = 8.5f;
        Float b = 6.5f;
        Float c = a * b;
        return c;
    }

    //praty
    public Float multipleByParameterAndReturnValue(Float u, Float v){
        Float w = u;
        Float x = v;
        Float y = w * x;
        return y;
    }
}
