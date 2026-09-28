package com.shauryax.methodType;

public class SubfloatTwoNumberUserMethod {

    public static void main(String[] args){
        Float x = 54.3f;
        Float y = 96.8f;
        Float z = x - y;
        System.out.println("sub = "+ z);

        SubfloatTwoNumberUserMethod subTwoNumber =
                new SubfloatTwoNumberUserMethod();

        subTwoNumber.subtraction();
        subTwoNumber.subtractionByParameter(5f,2f);

        Float artivalue = subTwoNumber.subtractionAndReturnValue();
        System.out.println("sub of artivalue = "+ artivalue);

        Float pratyvalue =
                subTwoNumber.subtractionByParameterAndReturnValue(122f,22f);
        System.out.println("sub of pratyvalue = "+ pratyvalue);
    }

    //suraj
    public void subtraction(){
        Float a = 74.8f;
        Float b = 30.3f;
        Float c = a - b;
        System.out.println("subtraction of two number is "+ c);
    }

    //himan
    public void subtractionByParameter(Float a , Float b){
        Float d = a;
        Float e = b;
        Float f = a - b;
        System.out.println("parameter subtraction of two number is "+ f);
    }

    //arti
    public Float subtractionAndReturnValue(){
        Float a = 55.9f;
        Float b = 60.8f;
        Float c = a - b;
        return c;
    }

    //praty
    public Float subtractionByParameterAndReturnValue(Float u, Float v){
        Float w = u;
        Float x = v;
        Float y = w - x;
        return y;
    }
}
