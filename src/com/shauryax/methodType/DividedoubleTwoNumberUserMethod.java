package com.shauryax.methodType;

public class DividedoubleTwoNumberUserMethod {

    public static void main(String[] args){
        Double x = 94.3;
        Double y = 6.0;
        Double z = x / y;
        System.out.println("divide = " + z);

        DividedoubleTwoNumberUserMethod divideTwoNumber =
                new DividedoubleTwoNumberUserMethod();

        divideTwoNumber.division();
        divideTwoNumber.divisionByParameter(10.0, 2.0);

        Double artivalue = divideTwoNumber.divisionAndReturnValue();
        System.out.println("divide of artivalue = " + artivalue);

        Double pratyvalue =
                divideTwoNumber.divisionByParameterAndReturnValue(120.0, 10.0);
        System.out.println("divide of pratyvalue = " + pratyvalue);
    }

    //suraj
    public void division(){
        Double a = 66.8;
        Double b = 8.0;
        Double c = a / b;
        System.out.println("division of two number is " + c);
    }

    //himan
    public void divisionByParameter(Double a, Double b){
        Double d = a;
        Double e = b;
        Double f = a / b;
        System.out.println("parameter division of two number is " + f);
    }

    //arti
    public Double divisionAndReturnValue(){
        Double a = 60.9;
        Double b = 20.0;
        Double c = a / b;
        return c;
    }

    //praty
    public Double divisionByParameterAndReturnValue(Double u, Double v){
        Double w = u;
        Double x = v;
        Double y = w / x;
        return y;
    }
}
