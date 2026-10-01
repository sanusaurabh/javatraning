package ModulusTestClass;

public class modulusFloatTestClass {
    public static void main(String[] args) {

        modulusFloatClass modulusFloatClass = new modulusFloatClass();
        modulusFloatClass.modulus();
        modulusFloatClass.modulusByParameter(345365f, 56f);
        modulusFloatClass.modulusByParametersAndReturnValues(345365f, 56f);
        modulusFloatClass.modulusByReturnValues();
    }
}
