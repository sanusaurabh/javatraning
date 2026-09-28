package com.shauryax.methodType;

public class DividelongTwoNumberUserMethod {

    public static void main(String[] args){
        Long x = 4400000000L;
        Long y = 4L;
        Long z = x / y;
        System.out.println("divide = " + z);

        DividelongTwoNumberUserMethod divideTwoNumber =
                new DividelongTwoNumberUserMethod();

        divideTwoNumber.division();
        divideTwoNumber.divisionByParameter(100L, 2L);

        Long artivalue = divideTwoNumber.divisionAndReturnValue();
        System.out.println("divide of artivalue = " + artivalue);

        Long pratyvalue =
                divideTwoNumber.divisionByParameterAndReturnValue(1200L, 10L);
        System.out.println("divide of pratyvalue = " + pratyvalue);
    }

    //suraj
    public void division(){
        Long a = 600L;
        Long b = 40L;
        Long c = a / b;
        System.out.println("division of two number is " + c);
    }

    //himan
    public void divisionByParameter(Long a, Long b){
        Long d = a;
        Long e = b;
        Long f = a / b;
        System.out.println("parameter division of two number is " + f);
    }

    //arti
    public Long divisionAndReturnValue(){
        Long a = 400L;
        Long b = 10L;
        Long c = a / b;
        return c;
    }

    //praty
    public Long divisionByParameterAndReturnValue(Long u, Long v){
        Long w = u;
        Long x = v;
        Long y = w / x;
        return y;
    }
}