package com.shauryax.methodType;

public class AdddoubleTwoNumberUserMethod {

    public static void main(String[] args){
        Double x = 84.3;
        Double y = 56.8;
        Double z = x + y;
        System.out.println("sum = "+ z);

        AdddoubleTwoNumberUserMethod addTwoNumber =
                new AdddoubleTwoNumberUserMethod();

        addTwoNumber.addition();
        addTwoNumber.additionByParameter(5.0,2.0);

        Double artivalue = addTwoNumber.additionAndReturnValue();
        System.out.println("sum of artivalue = "+ artivalue);

        Double pratyvalue =
                addTwoNumber.additionByParameterAndReturnValue(122.0,22.0);
        System.out.println("sum of pratyvalue = "+ pratyvalue);
    }

    //suraj
    public void addition(){
        Double a = 44.8;
        Double b = 50.3;
        Double c = a + b;
        System.out.println("addition of two number is "+ c);
    }

    //himan
    public void additionByParameter(Double a , Double b){
        Double d = a;
        Double e = b;
        Double f = a + b;
        System.out.println("parameter addition of two number is "+ f);
    }

    //arti
    public Double additionAndReturnValue(){
        Double a = 45.9;
        Double b = 54.8;
        Double c = a + b;
        return c;
    }

    //praty
    public Double additionByParameterAndReturnValue(Double u, Double v){
        Double w = u;
        Double x = v;
        Double y = w + x;
        return y;
    }
}
