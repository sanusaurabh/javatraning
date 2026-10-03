package modulus;

public class ModulousInt {
    public  void modulus(){

        int suraj = 70;
        int himanshu = 20;
        int arti = suraj % himanshu;
        System.out.println("Value of two modulous int numbers "+arti);

    }
    public void moduloByParameter(int t, int r){

        int a = t;
        int b = r;
        int c = a % b;
        System.out.println("Value of two modulous int numbers "+c);

    }
    public int moduloReturnAndValue(){

        int x = 36;
        int y = 7;
        int z = x % y;
        return z;

    }
    public int moduloReturnAndValueByParameter(int l, int k){

        int m = l;
        int n = k;
        int o = m % n;
        return o;


    }
}
