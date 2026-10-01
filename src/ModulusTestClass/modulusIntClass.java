package ModulusTestClass;

public class modulusIntClass {
    public void modulus(){
        int num1 = 657;
        int num2 = 67;
        int modulus = num1 % num2;
        System.out.println("The modulus is " + modulus);
    }

    public void modulusByParameter(int num1, int num2 ){
        int modulus = num1 % num2;
        System.out.println("The modulus is " + modulus);
    }

    public int modulusByReturnValue(){
        int num1 = 657;
        int num2 = 67;
        int modulus = num1 % num2;
        System.out.println("The modulus is " + modulus);
        return modulus;
    }

    public int modulusByParameterAndReturnValue(int num1, int num2){
        int modulus = num1 % num2;
        System.out.println("The modulus is " + modulus);
        return modulus;
    }
}
