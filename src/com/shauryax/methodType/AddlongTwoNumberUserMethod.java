package com.shauryax.methodType;

public class AddlongTwoNumberUserMethod {

    public static void main(String[] args){
        Long x = 8400000000L;
        Long y = 5600000000L;
        Long z = x + y;
        System.out.println("sum = "+ z);

        AddlongTwoNumberUserMethod addTwoNumber =
                new AddlongTwoNumberUserMethod();

        addTwoNumber.addition();
        addTwoNumber.additionByParameter(5L,2L);

        Long artivalue = addTwoNumber.additionAndReturnValue();
        System.out.println("sum of artivalue = "+ artivalue);

        Long pratyvalue =
                addTwoNumber.additionByParameterAndReturnValue(122L,22L);
        System.out.println("sum of pratyvalue = "+ pratyvalue);
    }

    //suraj
    public void addition(){
        Long a = 4400000000L;
        Long b = 5000000000L;
        Long c = a + b;
        System.out.println("addition of two number is "+ c);
    }

    //himan
    public void additionByParameter(Long a , Long b){
        Long d = a;
        Long e = b;
        Long f = a + b;
        System.out.println("parameter addition of two number is "+ f);
    }

    //arti
    public Long additionAndReturnValue(){
        Long a = 4500000000L;
        Long b = 5400000000L;
        Long c = a + b;
        return c;
    }

    //praty
    public Long additionByParameterAndReturnValue(Long u, Long v){
        Long w = u;
        Long x = v;
        Long y = w + x;
        return y;
    }
}
