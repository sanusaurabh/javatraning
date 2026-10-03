package modulustest;

public class ModulusFloat {

    public void modulus(){
        float num1 = 453.4f;
        float num2 = -83.4f;
        float modulus = num1 % num2;
        System.out.println("The modulus of two float numbers is = " + modulus);
    }

    public void modulusByParameter(float num1, float num2){
        float modulus = num1 % num2;
        System.out.println("The modulus of two float numbers is = " + modulus);
    }

    public float modulusByReturnValues(){
        float num1 = 453.4f;
        float num2 = -83.4f;
        float modulus = num1 % num2;
        System.out.println("The modulus of two float numbers is = " + modulus);
        return modulus;
    }

    public float modulusByParametersAndReturnValues(float num1, float num2){
        float modulus = num1 % num2;
        System.out.println("The modulus of two float numbers is = " + modulus);
        return modulus;
    }
}
