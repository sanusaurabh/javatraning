package com.shauryax.methodType;

public class SubdoubleTwoNumberUserMethod {

    public static void main(String[] args){
        Double x = 44.3;
        Double y = 66.8;
        Double z = x - y;
        System.out.println("sub = " + z);

        SubdoubleTwoNumberUserMethod subTwoNumber =
                new SubdoubleTwoNumberUserMethod();

        subTwoNumber.subtraction();
        subTwoNumber.subtractionByParameter(5.0, 2.0);

        Double artivalue = subTwoNumber.subtractionAndReturnValue();
        System.out.println("sub of artivalue = " + artivalue);

        Double pratyvalue =
                subTwoNumber.subtractionByParameterAndReturnValue(122.0, 22.0);
        System.out.println("sub of pratyvalue = " + pratyvalue);
    }

    //suraj
    public void subtraction(){
        Double a = 64.8;
        Double b = 60.3;
        Double c = a - b;
        System.out.println("subtraction of two number is " + c);
    }

    //himan
    public void subtractionByParameter(Double a, Double b){
        Double d = a;
        Double e = b;
        Double f = a - b;
        System.out.println("parameter subtraction of two number is " + f);
    }

    //arti
    public Double subtractionAndReturnValue(){
        Double a = 65.9;
        Double b = 74.8;
        Double c = a - b;
        return c;
    }

    //praty
    public Double subtractionByParameterAndReturnValue(Double u, Double v){
        Double w = u;
        Double x = v;
        Double y = w - x;
        return y;
    }
}
