package com.shauryax.methodType;

public class SublongTwoNumberUserMethod {

    public static void main(String[] args){
        Long x = 8400000000L;
        Long y = 5600000000L;
        Long z = x - y;
        System.out.println("sub = " + z);

        SublongTwoNumberUserMethod subTwoNumber =
                new SublongTwoNumberUserMethod();

        subTwoNumber.subtraction();
        subTwoNumber.subtractionByParameter(5L, 2L);

        Long artivalue = subTwoNumber.subtractionAndReturnValue();
        System.out.println("sub of artivalue = " + artivalue);

        Long pratyvalue =
                subTwoNumber.subtractionByParameterAndReturnValue(122L, 22L);
        System.out.println("sub of pratyvalue = " + pratyvalue);
    }

    //suraj
    public void subtraction(){
        Long a = 4400000000L;
        Long b = 5000000000L;
        Long c = a - b;
        System.out.println("subtraction of two number is " + c);
    }

    //himan
    public void subtractionByParameter(Long a, Long b){
        Long d = a;
        Long e = b;
        Long f = a - b;
        System.out.println("parameter subtraction of two number is " + f);
    }

    //arti
    public Long subtractionAndReturnValue(){
        Long a = 4500000000L;
        Long b = 5400000000L;
        Long c = a - b;
        return c;
    }

    //praty
    public Long subtractionByParameterAndReturnValue(Long u, Long v){
        Long w = u;
        Long x = v;
        Long y = w - x;
        return y;
    }
}
