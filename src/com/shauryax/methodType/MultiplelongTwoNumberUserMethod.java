package com.shauryax.methodType;

public class MultiplelongTwoNumberUserMethod {

    public static void main(String[] args){
        Long x = 100000L;
        Long y = 200000L;
        Long z = x * y;
        System.out.println("multiple = " + z);

        MultiplelongTwoNumberUserMethod multipleTwoNumber =
                new MultiplelongTwoNumberUserMethod();

        multipleTwoNumber.multiple();
        multipleTwoNumber.multipleByParameter(5L, 2L);

        Long artivalue = multipleTwoNumber.multipleAndReturnValue();
        System.out.println("multiple of artivalue = " + artivalue);

        Long pratyvalue =
                multipleTwoNumber.multipleByParameterAndReturnValue(12L, 2L);
        System.out.println("multiple of pratyvalue = " + pratyvalue);
    }

    //suraj
    public void multiple(){
        Long a = 100000L;
        Long b = 200000L;
        Long c = a * b;
        System.out.println("multiple of two number is " + c);
    }

    //himan
    public void multipleByParameter(Long a, Long b){
        Long d = a;
        Long e = b;
        Long f = a * b;
        System.out.println("parameter multiple of two number is " + f);
    }

    //arti
    public Long multipleAndReturnValue(){
        Long a = 150000L;
        Long b = 50000L;
        Long c = a * b;
        return c;
    }

    //praty
    public Long multipleByParameterAndReturnValue(Long u, Long v){
        Long w = u;
        Long x = v;
        Long y = w * x;
        return y;
    }
}