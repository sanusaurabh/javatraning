package modulus;

public class ModulousIntTest {
    public static void main(String[] args){
        ModulousInt moduloudtwointnumbers = new ModulousInt();
        moduloudtwointnumbers.modulus();

        moduloudtwointnumbers.moduloByParameter(90,20);

        int asit = moduloudtwointnumbers.moduloReturnAndValue();
        System.out.println("Value of modulo two int numbers moduloReturnAndValue "+asit);

        int silu = moduloudtwointnumbers.moduloReturnAndValueByParameter(29, 5);
        System.out.println("Value of modulo two int numbers moduloReturnAndValueByParameter "+silu);
    }
}
