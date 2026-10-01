package modulustest;

public class ModulusDouble {

    public void modulus(){
        double num1 = 5556.43;
        double num2 = 56.7;
        double modulus = num1 % num2;
        System.out.println("The modulus of two double numbers is = " + modulus);
    }
    public double modulusByReturnValues(){
        double num1 = 5556.43;
        double num2 = 56.7;
        double modulus = num1 % num2;
        System.out.println("The modulus of two double numbers is = " + modulus);
        return modulus;
    }
    public void modulusByParameters(double num1, double num2){
         double modulus = num1 % num2;
         System.out.println("The modulus of two double numbers is = " + modulus);
    }

    public double modulusByParametersAndReturnValues(double num1, double num2){
        double modulus = num1 % num2;
        System.out.println("The modulus of two double numbers is = " + modulus);
        return modulus;
    }
}
