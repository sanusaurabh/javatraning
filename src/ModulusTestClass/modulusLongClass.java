package ModulusTestClass;

public class modulusLongClass {
    public void modulus(){
        long num1 = 54747567l;
        long num2 = -5474l;
        long modulus = num1 % num2;
        System.out.println( "The modulus of two long numbers is - "+ modulus);
    }

    public void modulusByParameters(long num1, long num2){
        long modulus = num1 % num2;
        System.out.println( "The modulus of two long numbers is - "+ modulus);

    }

    public long modulusByReturnValues(){
        long num1 = 54747567l;
        long num2 = -5474l;
        long modulus = num1 % num2;
        System.out.println( "The modulus of two long numbers is - "+ modulus);
        return modulus;
    }

    public long modulusByParametersAndReturnValues(long num1, long num2){
        long modulus = num1 % num2;
        System.out.println( "The modulus of two long numbers is - "+ modulus);
        return modulus;
    }
}
