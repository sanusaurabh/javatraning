package com.shauryax.methodType;

public class AddFloatTwoNumberUserMethod {

    public static void main(String[] args){
        Float x = 84.3f;
        Float y = 56.8f;
        Float z = x + y;
        System.out.println("sum = "+ z);

        //addition();
        AddFloatTwoNumberUserMethod addTwoNumber = new AddFloatTwoNumberUserMethod();
        addTwoNumber.addition();
        addTwoNumber.additionByParameter(5f,2f);

        Float artivalue = addTwoNumber.additionAndReturnValue();
        System.out.println("sum of artivalue = "+ artivalue);


        Float pratyvalue = addTwoNumber.additionByParameterAndReturnValue(122f,22f);
        System.out.println("sum of pratyvalue = "+ pratyvalue);
    }
    //suraj
    public void addition(){
        Float a = 44.8f;
        Float b = 50.3f;
        Float c = a + b;
        System.out.println("addition of two number is "+ c);
    }
    //himan
    public void additionByParameter(Float a , Float b){
        Float d = a;
        Float e = b;
        Float f = a + b;
        System.out.println("parameter addition of two number is "+ f);
    }
    //arti
    public Float additionAndReturnValue(){
        Float a = 45.9f;
        Float b = 54.8f;
        Float c = a + b;
        return c;
    }
    //praty
    public
    Float additionByParameterAndReturnValue(Float u, Float v){
        Float w = u;
        Float x = v;
        Float y = w + x;
        return y;
    }
}
