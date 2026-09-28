package com.shauryax.methodType;

public class MultipleDoubleTwoNumberUserMethod {

    public static void main(String[] args){
        Double x = 10.5;
        Double y = 20.5;
        Double z = x * y;
        System.out.println("multiple = " + z);

        MultipleDoubleTwoNumberUserMethod multipleTwoNumber =
                new MultipleDoubleTwoNumberUserMethod();

        multipleTwoNumber.multiple();
        multipleTwoNumber.multipleByParameter(5.0, 2.0);

        Double artivalue = multipleTwoNumber.multipleAndReturnValue();
        System.out.println("multiple of artivalue = " + artivalue);

        Double pratyvalue =
                multipleTwoNumber.multipleByParameterAndReturnValue(12.0, 2.0);
        System.out.println("multiple of pratyvalue = " + pratyvalue);
    }

    //suraj
    public void multiple(){
        Double a = 10.5;
        Double b = 20.5;
        Double c = a * b;
        System.out.println("multiple of two number is " + c);
    }

    //himan
    public void multipleByParameter(Double a, Double b){
        Double d = a;
        Double e = b;
        Double f = a * b;
        System.out.println("parameter multiple of two number is " + f);
    }

    //arti
    public Double multipleAndReturnValue(){
        Double a = 15.5;
        Double b = 5.5;
        Double c = a * b;
        return c;
    }

    //praty
    public Double multipleByParameterAndReturnValue(Double u, Double v){
        Double w = u;
        Double x = v;
        Double y = w * x;
        return y;
    }
}
