package com.shauryax.methodType;

public class AddshortTwoNumberUserMethod {

    public static void main(String[] args){
        Short x = 84;
        Short y = 56;
        Short z = (short) (x + y);
        System.out.println("sum = "+ z);

        AddshortTwoNumberUserMethod addTwoNumber =
                new AddshortTwoNumberUserMethod();

        addTwoNumber.addition();
        addTwoNumber.additionByParameter((short)5,(short)2);

        Short artivalue = addTwoNumber.additionAndReturnValue();
        System.out.println("sum of artivalue = "+ artivalue);

        Short pratyvalue =
                addTwoNumber.additionByParameterAndReturnValue((short)122,(short)22);
        System.out.println("sum of pratyvalue = "+ pratyvalue);
    }

    //suraj
    public void addition(){
        Short a = 44;
        Short b = 50;
        Short c = (short) (a + b);
        System.out.println("addition of two number is "+ c);
    }

    //himan
    public void additionByParameter(Short a , Short b){
        Short d = a;
        Short e = b;
        Short f = (short) (a + b);
        System.out.println("parameter addition of two number is "+ f);
    }

    //arti
    public Short additionAndReturnValue(){
        Short a = 45;
        Short b = 54;
        Short c = (short) (a + b);
        return c;
    }

    //praty
    public Short additionByParameterAndReturnValue(Short u, Short v){
        Short w = u;
        Short x = v;
        Short y = (short) (w + x);
        return y;
    }
}
